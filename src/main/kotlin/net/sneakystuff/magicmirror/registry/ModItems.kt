package net.sneakystuff.magicmirror.registry

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.sneakystuff.magicmirror.MagicMirror

public class ModItems {
    //Items
    val RUBY: Item = Item(Item.Settings().group(ItemGroup.MATERIALS))

    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(MagicMirror.MOD_ID, "ruby"), RUBY)
    }
}