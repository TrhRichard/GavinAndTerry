package me.trhrichard

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModBlocks {
    private val blockSetting: FabricBlockSettings = FabricBlockSettings.create().strength(.5f).hardness(.5f)//.requiresTool()

    val GavinBlock = registerBlock("gavin",Block(blockSetting))
    val GavinItem = ModItems.registerItem("gavin", BlockItem(GavinBlock, FabricItemSettings()))
    val TerryBlock = registerBlock("terry",Block(blockSetting))
    val TerryItem = ModItems.registerItem("terry", BlockItem(TerryBlock, FabricItemSettings()))
    val TevinBlock = registerBlock("tevin",Block(blockSetting))
    val TevinItem = ModItems.registerItem("tevin", BlockItem(TevinBlock, FabricItemSettings()))
    val HenryBlock = registerBlock("henry",Block(blockSetting))
    val HenryItem = ModItems.registerItem("henry", BlockItem(HenryBlock, FabricItemSettings()))
    val BenjaminBlock = registerBlock("benjamin",Block(blockSetting))
    val BenjaminItem = ModItems.registerItem("benjamin", BlockItem(BenjaminBlock, FabricItemSettings()))

    private fun registerBlock(blockId: String, block: Block): Block {
        return Registry.register(Registries.BLOCK, Identifier(GavinAndTerry.MOD_ID, blockId), block)
    }

    fun init() {
        GavinAndTerry.logger.info("Registering blocks")
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register { entries ->
            entries.add(GavinItem)
            entries.add(TerryItem)
            entries.add(TevinItem)
            entries.add(HenryItem)
            entries.add(BenjaminItem)
        }
    }

}