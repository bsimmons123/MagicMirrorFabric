package net.sneakystuff.magicmirror.items

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World


class MagicMirrorItem(settings: Settings?) : Item(settings) {

    override fun use(world: World?, playerEntity: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack?>? {
        playerEntity.teleport(-1300.0, 70.0, 1000.0)
        playerEntity.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F)
        return TypedActionResult.success(playerEntity.getStackInHand(hand))
    }

}