package me.trhrichard

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object GavinAndTerry : ModInitializer {
	const val MOD_ID = "gavinandterry"
    val logger: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Loading $MOD_ID!")

		ModBlocks.init()
	}
}