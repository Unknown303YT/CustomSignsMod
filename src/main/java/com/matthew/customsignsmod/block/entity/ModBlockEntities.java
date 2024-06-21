package com.matthew.customsignsmod.block.entity;


import com.matthew.customsignsmod.CustomSignsMod;
import com.matthew.customsignsmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CustomSignsMod.MOD_ID);


    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get(),
                            ModBlocks.COOL_SIGN.get(), ModBlocks.COOL_WALL_SIGN.get(),

                            ModBlocks.APPLE_SIGN.get(), ModBlocks.APPLE_WALL_SIGN.get(),
                            ModBlocks.BANANA_SIGN.get(), ModBlocks.BANANA_WALL_SIGN.get(),
                            ModBlocks.CHERRY_SIGN.get(), ModBlocks.CHERRY_WALL_SIGN.get(),
                            ModBlocks.DURIAN_SIGN.get(), ModBlocks.DURIAN_WALL_SIGN.get(),
                            ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get(),
                            ModBlocks.FIG_SIGN.get(), ModBlocks.FIG_WALL_SIGN.get(),
                            ModBlocks.GRAPE_SIGN.get(), ModBlocks.GRAPE_WALL_SIGN.get(),
                            ModBlocks.HONEY_SIGN.get(), ModBlocks.HONEY_WALL_SIGN.get(),
                            ModBlocks.IMBE_SIGN.get(), ModBlocks.IMBE_WALL_SIGN.get(),
                            ModBlocks.JACK_SIGN.get(), ModBlocks.JACK_WALL_SIGN.get(),
                            ModBlocks.KIWI_SIGN.get(), ModBlocks.KIWI_WALL_SIGN.get(),
                            ModBlocks.LEMON_SIGN.get(), ModBlocks.LEMON_WALL_SIGN.get(),
                            ModBlocks.MELON_SIGN.get(), ModBlocks.MELON_WALL_SIGN.get(),
                            ModBlocks.NECTARINE_SIGN.get(), ModBlocks.NECTARINE_WALL_SIGN.get(),
                            ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get(),
                            ModBlocks.PEAR_SIGN.get(), ModBlocks.PEAR_WALL_SIGN.get()

                            ).build(null));











    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get()).build(null));




    public static void register(IEventBus eventBus){ BLOCK_ENTITIES.register(eventBus);}
}
