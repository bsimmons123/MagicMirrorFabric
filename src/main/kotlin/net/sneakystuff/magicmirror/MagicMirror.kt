package net.sneakystuff.magicmirror

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier
import net.sneakystuff.magicmirror.registry.ModItems


class MagicMirror() : ModInitializer {

    override fun onInitialize() {
        val modItems = ModItems()
        modItems.registerItems() // don't need to register blocks for this mod ... yet ...
    }

    companion object {
        const val MOD_ID: String = "mmirror"
        //Item Groups
        val ITEM_GROUP: ItemGroup = FabricItemGroupBuilder.build(
            Identifier(MOD_ID, "general")
        ) { ItemStack(Items.ARROW) }
    }
}