package net.sneakystuff.magicmirror.registry

import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.sneakystuff.magicmirror.MagicMirror

class ModItems {
    //Items
    val ruby: Item = Item(Item.Settings().group(MagicMirror.ITEM_GROUP))

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(MagicMirror.MOD_ID, "ruby"), ruby)
    }
}