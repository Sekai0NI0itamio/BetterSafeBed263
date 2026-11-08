package itamio.bettersafebed.mixin;

import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Port of frankV's MonsterMixin: a monster only prevents resting
 * if it is actually targeting that player. Mobs lurking in caves
 * below your base or outside walls can no longer block sleeping
 * when you are safe.
 */
@Mixin(Monster.class)
public class MonsterMixin {
    @Inject(method = "isPreventingPlayerRest", at = @At("HEAD"), cancellable = true)
    private void bettersafebed263$injectIsPreventingPlayerRest(Player player, CallbackInfoReturnable<Boolean> cir) {
        if (((Monster) (Object) this).getTarget() instanceof Player target) {
            if (target.equals(player)) {
                cir.setReturnValue(true);
                return;
            }
        }
        cir.setReturnValue(false);
    }
}
