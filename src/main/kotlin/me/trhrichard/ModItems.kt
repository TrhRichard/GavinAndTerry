package me.trhrichard

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {

    fun registerItem(itemId: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(GavinAndTerry.MOD_ID, itemId), item)
    }

}