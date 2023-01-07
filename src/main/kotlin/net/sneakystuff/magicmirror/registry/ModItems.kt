package net.sneakystuff.magicmirror.registry

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.sneakystuff.magicmirror.MagicMirror
import net.sneakystuff.magicmirror.items.MagicMirrorItem

class ModItems {
    //Items
    val magic_mirror: MagicMirrorItem = MagicMirrorItem(Item.Settings().group(MagicMirror.ITEM_GROUP))

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(MagicMirror.MOD_ID, "magic_mirror"), magic_mirror)
    }
}