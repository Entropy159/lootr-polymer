package tornato.lootr.mixin;

import eu.pb4.polymer.core.api.block.PolymerBlockUtils;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import noobanidus.mods.lootr.fabric.init.ModBlockEntities;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModBlockEntities.class)
public class ModBlockEntitiesMixin {
    @Inject(method = "registerBlockEntities", at = @At("TAIL"))
    private static void lootrPolymer$registerBeOverlays(CallbackInfo ci) {
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.CHEST,
                (be, ctx) -> BlockEntityTypes.CHEST);
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.TRAPPED_CHEST,
                (be, ctx) -> BlockEntityTypes.TRAPPED_CHEST);
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.SHULKER_BOX,
                (be, ctx) -> BlockEntityTypes.SHULKER_BOX);
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.BARREL,
                (be, ctx) -> BlockEntityTypes.BARREL);
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.BRUSHABLE_BLOCK,
                (be, ctx) -> BlockEntityTypes.BRUSHABLE_BLOCK);
        PolymerBlockUtils.registerBlockEntity(ModBlockEntities.DECORATED_POT,
                (be, ctx) -> BlockEntityTypes.DECORATED_POT);
    }
}
