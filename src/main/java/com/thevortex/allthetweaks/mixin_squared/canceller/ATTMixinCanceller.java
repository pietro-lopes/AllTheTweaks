package com.thevortex.allthetweaks.mixin_squared.canceller;

import com.bawnorton.mixinsquared.api.MixinCanceller;

import java.util.List;
import java.util.Set;

public class ATTMixinCanceller implements MixinCanceller {
    private static final Set<String> mixinsToCancel = Set.of(
            "com.faboslav.villagesandpillages.mixin.LessTreesInVillageWitchMixin",
            "com.faboslav.villagesandpillages.mixin.NoTreesOnWitchVillageHouseMixin"
    );

    @Override
    public boolean shouldCancel(List<String> targetClassNames, String mixinClassName) {
        return mixinsToCancel.contains(mixinClassName);
    }
}
