package com.matthew.customsignsmod.datagen.loot;


import com.matthew.customsignsmod.block.ModBlocks;
import com.matthew.customsignsmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTable extends BlockLootSubProvider {
    public ModBlockLootTable() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.PINE_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_SIGN.get()));


        this.add(ModBlocks.COOL_SIGN.get(), block ->
                createSingleItemTable(ModItems.COOL_SIGN.get()));
        this.add(ModBlocks.COOL_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.COOL_SIGN.get()));



        this.add(ModBlocks.APPLE_SIGN.get(), block ->
                createSingleItemTable(ModItems.APPLE_SIGN.get()));
        this.add(ModBlocks.APPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.APPLE_SIGN.get()));

        this.add(ModBlocks.BANANA_SIGN.get(), block ->
                createSingleItemTable(ModItems.BANANA_SIGN.get()));
        this.add(ModBlocks.BANANA_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BANANA_SIGN.get()));

        this.add(ModBlocks.CHERRY_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHERRY_SIGN.get()));
        this.add(ModBlocks.CHERRY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHERRY_SIGN.get()));

        this.add(ModBlocks.DURIAN_SIGN.get(), block ->
                createSingleItemTable(ModItems.DURIAN_SIGN.get()));
        this.add(ModBlocks.DURIAN_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.DURIAN_SIGN.get()));


        this.add(ModBlocks.ELDER_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_SIGN.get()));
        this.add(ModBlocks.ELDER_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ELDER_SIGN.get()));

        this.add(ModBlocks.FIG_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIG_SIGN.get()));
        this.add(ModBlocks.FIG_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIG_SIGN.get()));

        this.add(ModBlocks.GRAPE_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAPE_SIGN.get()));
        this.add(ModBlocks.GRAPE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRAPE_SIGN.get()));

        this.add(ModBlocks.HONEY_SIGN.get(), block ->
                createSingleItemTable(ModItems.HONEY_SIGN.get()));
        this.add(ModBlocks.HONEY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.HONEY_SIGN.get()));

        this.add(ModBlocks.IMBE_SIGN.get(), block ->
                createSingleItemTable(ModItems.IMBE_SIGN.get()));
        this.add(ModBlocks.IMBE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.IMBE_SIGN.get()));

        this.add(ModBlocks.JACK_SIGN.get(), block ->
                createSingleItemTable(ModItems.JACK_SIGN.get()));
        this.add(ModBlocks.JACK_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.JACK_SIGN.get()));

        this.add(ModBlocks.KIWI_SIGN.get(), block ->
                createSingleItemTable(ModItems.KIWI_SIGN.get()));
        this.add(ModBlocks.KIWI_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.KIWI_SIGN.get()));

        this.add(ModBlocks.LEMON_SIGN.get(), block ->
                createSingleItemTable(ModItems.LEMON_SIGN.get()));
        this.add(ModBlocks.LEMON_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.LEMON_SIGN.get()));

        this.add(ModBlocks.MELON_SIGN.get(), block ->
                createSingleItemTable(ModItems.MELON_SIGN.get()));
        this.add(ModBlocks.MELON_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MELON_SIGN.get()));

        this.add(ModBlocks.NECTARINE_SIGN.get(), block ->
                createSingleItemTable(ModItems.NECTARINE_SIGN.get()));
        this.add(ModBlocks.NECTARINE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.NECTARINE_SIGN.get()));

        this.add(ModBlocks.ORANGE_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_SIGN.get()));
        this.add(ModBlocks.ORANGE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.ORANGE_SIGN.get()));

        this.add(ModBlocks.PEAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEAR_SIGN.get()));
        this.add(ModBlocks.PEAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEAR_SIGN.get()));




        this.add(ModBlocks.PINE_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
        this.add(ModBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PINE_HANGING_SIGN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
