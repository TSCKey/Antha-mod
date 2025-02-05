package net.tsckey.dodo.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.tsckey.dodo.entity.custom.AnthaStaffProjectileEntity;

public class AnthaStaff extends Item {
    public AnthaStaff(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.NEUTRAL, 0.5F, 1.0F);
        if (!world.isClient) {
            AnthaStaffProjectileEntity antha_staff = new AnthaStaffProjectileEntity(world, user);
            antha_staff.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.5f, 0f);
            world.spawnEntity(antha_staff);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(stack, world.isClient());
    }
}
