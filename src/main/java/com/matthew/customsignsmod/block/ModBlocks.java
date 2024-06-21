package com.matthew.customsignsmod.block;

import com.matthew.customsignsmod.CustomSignsMod;

import com.matthew.customsignsmod.block.custom.ModHangingSignBlock;
import com.matthew.customsignsmod.block.custom.ModStandingSignBlock;
import com.matthew.customsignsmod.block.custom.ModWallHangingSignBlock;
import com.matthew.customsignsmod.block.custom.ModWallSignBlock;
import com.matthew.customsignsmod.item.ModItems;
import com.matthew.customsignsmod.util.ModWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CustomSignsMod.MOD_ID);


    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });


    //These two will represent the sign on the floor and wall
    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PINE));



    //TEST
    public static final RegistryObject<Block> COOL_SIGN = BLOCKS.register("cool_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.COOL));
    public static final RegistryObject<Block> COOL_WALL_SIGN = BLOCKS.register("cool_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),  ModWoodTypes.COOL));


    public static final RegistryObject<Block> APPLE_SIGN = BLOCKS.register("apple_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.APPLE));
    public static final RegistryObject<Block> APPLE_WALL_SIGN = BLOCKS.register("apple_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),  ModWoodTypes.APPLE));

    public static final RegistryObject<Block> BANANA_SIGN = BLOCKS.register("banana_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BANANA));
    public static final RegistryObject<Block> BANANA_WALL_SIGN = BLOCKS.register("banana_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),  ModWoodTypes.BANANA));

    public static final RegistryObject<Block> CHERRY_SIGN = BLOCKS.register("cherry_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CHERRY));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = BLOCKS.register("cherry_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),  ModWoodTypes.CHERRY));

    public static final RegistryObject<Block> DURIAN_SIGN = BLOCKS.register("durian_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.DURIAN));
    public static final RegistryObject<Block> DURIAN_WALL_SIGN = BLOCKS.register("durian_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN),  ModWoodTypes.DURIAN));

    public static final RegistryObject<Block> ELDER_SIGN = BLOCKS.register("elder_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ELDER));
    public static final RegistryObject<Block> ELDER_WALL_SIGN = BLOCKS.register("elder_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ELDER));

    public static final RegistryObject<Block> FIG_SIGN = BLOCKS.register("fig_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.FIG));
    public static final RegistryObject<Block> FIG_WALL_SIGN = BLOCKS.register("fig_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.FIG));

    public static final RegistryObject<Block> GRAPE_SIGN = BLOCKS.register("grape_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.GRAPE));
    public static final RegistryObject<Block> GRAPE_WALL_SIGN = BLOCKS.register("grape_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GRAPE));

    public static final RegistryObject<Block> HONEY_SIGN = BLOCKS.register("honey_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.HONEY));
    public static final RegistryObject<Block> HONEY_WALL_SIGN = BLOCKS.register("honey_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.HONEY));

    public static final RegistryObject<Block> IMBE_SIGN = BLOCKS.register("imbe_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.IMBE));
    public static final RegistryObject<Block> IMBE_WALL_SIGN = BLOCKS.register("imbe_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.IMBE));

    public static final RegistryObject<Block> JACK_SIGN = BLOCKS.register("jack_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.JACK));
    public static final RegistryObject<Block> JACK_WALL_SIGN = BLOCKS.register("jack_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.JACK));

    public static final RegistryObject<Block> KIWI_SIGN = BLOCKS.register("kiwi_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.KIWI));
    public static final RegistryObject<Block> KIWI_WALL_SIGN = BLOCKS.register("kiwi_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.KIWI));

    public static final RegistryObject<Block> LEMON_SIGN = BLOCKS.register("lemon_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LEMON));
    public static final RegistryObject<Block> LEMON_WALL_SIGN = BLOCKS.register("lemon_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LEMON));

    public static final RegistryObject<Block> MELON_SIGN = BLOCKS.register("melon_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.MELON));
    public static final RegistryObject<Block> MELON_WALL_SIGN = BLOCKS.register("melon_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MELON));

    public static final RegistryObject<Block> NECTARINE_SIGN = BLOCKS.register("nectarine_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.NECTARINE));
    public static final RegistryObject<Block> NECTARINE_WALL_SIGN = BLOCKS.register("nectarine_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.NECTARINE));

    public static final RegistryObject<Block> ORANGE_SIGN = BLOCKS.register("orange_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ORANGE));
    public static final RegistryObject<Block> ORANGE_WALL_SIGN = BLOCKS.register("orange_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ORANGE));

    public static final RegistryObject<Block> PEAR_SIGN = BLOCKS.register("pear_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PEAR_WALL_SIGN = BLOCKS.register("pear_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PEAR));







    //These are for Hanging Signs if we decide to work with them
    public static final RegistryObject<Block> PINE_HANGING_SIGN = BLOCKS.register("pine_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_HANGING_SIGN = BLOCKS.register("pine_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PINE));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


}

