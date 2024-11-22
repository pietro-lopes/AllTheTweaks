package com.thevortex.allthetweaks.mixin;

import com.thevortex.allthetweaks.mods.VillagesAndPillages;
import com.yungnickyoung.minecraft.yungsapi.util.MixinUtils;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TreeFeature.class)
public class TreeFeatureMixin {
    @Inject(
            method = "place",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void villagesAndPillages_noTreeOrLessTreeInStructures(
            FeaturePlaceContext<TreeConfiguration> context, CallbackInfoReturnable<Boolean> cir
    ) {
        if (!VillagesAndPillages.IS_LOADED.get()) return;
        if (!(context.level() instanceof WorldGenRegion worldGenRegion)) return;

        if ((worldGenRegion.getBlockState(context.origin().below()).is(Blocks.MOSS_BLOCK) || context.random().nextFloat() > 0.5) && MixinUtils.isPositionInTaggedStructure(worldGenRegion, context.origin(), VillagesAndPillages.VILLAGE_WITCH)) {
            cir.setReturnValue(false);
        }
    }
}
