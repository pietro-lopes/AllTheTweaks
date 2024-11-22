package com.thevortex.allthetweaks.mods;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.neoforge.common.util.Lazy;

public class VillagesAndPillages {
    public static final String MOD_ID = "villagesandpillages";
    public static TagKey<Structure> VILLAGE_WITCH = TagKey.create(Registries.STRUCTURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, "village_witch"));
    public static Lazy<Boolean> IS_LOADED = Lazy.of(() -> {
        var mod = LoadingModList.get().getModFileById(MOD_ID);
        if (mod == null) {
            return false;
        } else {
            return mod.versionString().equals("1.0.1");
        }
    });
}
