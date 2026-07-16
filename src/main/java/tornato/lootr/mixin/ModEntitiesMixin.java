package tornato.lootr.mixin;

import eu.pb4.polymer.core.api.entity.PolymerEntityUtils;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import noobanidus.mods.lootr.common.entity.LootrChestMinecartEntity;
import noobanidus.mods.lootr.common.entity.LootrItemFrame;
import noobanidus.mods.lootr.fabric.init.ModEntities;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModEntities.class)
public class ModEntitiesMixin {
    @Inject(method = "registerEntities", at = @At("TAIL"))
    private static void lootrPolymer$registerEntityOverlays(CallbackInfo ci) {
        PolymerEntityUtils.registerOverlay(
                ModEntities.MINECART_WITH_CHEST,
                entity -> context -> EntityTypes.CHEST_MINECART
        );
        PolymerEntityUtils.registerOverlay(
                ModEntities.ITEM_FRAME,
                entity -> context -> EntityTypes.ITEM_FRAME
        );
    }
}
