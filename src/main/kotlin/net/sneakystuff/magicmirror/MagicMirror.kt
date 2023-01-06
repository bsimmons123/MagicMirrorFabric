package net.sneakystuff.magicmirror

import net.fabricmc.api.ModInitializer
import net.sneakystuff.magicmirror.registry.ModItems

class MagicMirror() : ModInitializer {

    override fun onInitialize() {
        val modItems = ModItems()
        modItems.registerItems()
    }

    companion object {
        const val MOD_ID: String = "mmirror"
    }
}