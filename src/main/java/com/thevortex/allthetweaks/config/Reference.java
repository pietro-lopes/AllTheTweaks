package com.thevortex.allthetweaks.config;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Reference {
    public static final String MOD_ID = "allthetweaks";

    public static ResourceLocation tweaks(String path) {
        return ResourceLocation.fromNamespaceAndPath("allthetweaks", path);
    }
    public static ResourceLocation forge(String path) {
        return ResourceLocation.fromNamespaceAndPath("c", path);
    }
    public static ResourceLocation block(String path) {
        return forge("storage_blocks/" + path);
    }

    public static String tab() {
        return String.format("itemGroup.%s", MOD_ID);
    }
    public static final TagKey<Block> ENDERPEARL_BLOCK = BlockTags.create(block("ender_pearl"));
    public static final TagKey<Block> NETHERSTAR_BLOCK = BlockTags.create(block("nether_star"));
    public static final TagKey<Block> ATMSTAR_BLOCK = BlockTags.create(block("atm_star"));
    public static final TagKey<Block> GREGSTAR_BLOCK = BlockTags.create(block("greg_star"));

    public static final TagKey<Block> BuildingGadgets = BlockTags.create(ResourceLocation.fromNamespaceAndPath("buildinggadgets","blacklist/copy_paste"));
    public static final TagKey<Block> BuildingGadgets_generic = BlockTags.create(ResourceLocation.fromNamespaceAndPath("buildinggadgets","blacklist/generic"));

    public static final TagKey<Item> ENDERPEARL_BLOCK_ITEM = ItemTags.create(Reference.block("ender_pearl"));
    public static final TagKey<Item> NETHERSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("nether_star"));
    public static final TagKey<Item> ATMSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("atm_star"));
    public static final TagKey<Item> GREGSTAR_BLOCK_ITEM = ItemTags.create(Reference.block("greg_star"));

    public static final TagKey<Item> STORAGE_BLOCKS = ItemTags.create(Reference.forge("storage_blocks"));

    public static final TagKey<Item> ATMSTAR = ItemTags.create(Reference.tweaks("atm_star"));
    public static final TagKey<Item> GREGSTAR = ItemTags.create(Reference.tweaks("greg_star"));

}
