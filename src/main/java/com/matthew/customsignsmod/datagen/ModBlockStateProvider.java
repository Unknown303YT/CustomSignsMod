package com.matthew.customsignsmod.datagen;



import com.matthew.customsignsmod.CustomSignsMod;
import com.matthew.customsignsmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//tutorialmod:mod_sign

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CustomSignsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


        blockWithItem(ModBlocks.PINE_PLANKS);


        signBlock(((StandingSignBlock) ModBlocks.PINE_SIGN.get()), ((WallSignBlock) ModBlocks.PINE_WALL_SIGN.get()),
            blockTexture(ModBlocks.PINE_PLANKS.get()));

        //TEST
        signBlock(((StandingSignBlock) ModBlocks.COOL_SIGN.get()), ((WallSignBlock) ModBlocks.COOL_WALL_SIGN.get()),
                blockTexture(ModBlocks.COOL_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.APPLE_SIGN.get()), ((WallSignBlock) ModBlocks.APPLE_WALL_SIGN.get()),
                blockTexture(ModBlocks.APPLE_SIGN.get()));
        signBlock(((StandingSignBlock) ModBlocks.CHERRY_SIGN.get()), ((WallSignBlock) ModBlocks.CHERRY_WALL_SIGN.get()),
                blockTexture(ModBlocks.CHERRY_SIGN.get()));
        signBlock(((StandingSignBlock) ModBlocks.BANANA_SIGN.get()), ((WallSignBlock) ModBlocks.BANANA_WALL_SIGN.get()),
                blockTexture(ModBlocks.BANANA_SIGN.get()));
        signBlock(((StandingSignBlock) ModBlocks.DURIAN_SIGN.get()), ((WallSignBlock) ModBlocks.DURIAN_WALL_SIGN.get()),
                blockTexture(ModBlocks.DURIAN_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.ELDER_SIGN.get()), ((WallSignBlock) ModBlocks.ELDER_WALL_SIGN.get()),
                blockTexture(ModBlocks.ELDER_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.FIG_SIGN.get()), ((WallSignBlock) ModBlocks.FIG_WALL_SIGN.get()),
                blockTexture(ModBlocks.FIG_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.GRAPE_SIGN.get()), ((WallSignBlock) ModBlocks.GRAPE_WALL_SIGN.get()),
                blockTexture(ModBlocks.GRAPE_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.HONEY_SIGN.get()), ((WallSignBlock) ModBlocks.HONEY_WALL_SIGN.get()),
                blockTexture(ModBlocks.HONEY_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.IMBE_SIGN.get()), ((WallSignBlock) ModBlocks.IMBE_WALL_SIGN.get()),
                blockTexture(ModBlocks.IMBE_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.JACK_SIGN.get()), ((WallSignBlock) ModBlocks.JACK_WALL_SIGN.get()),
                blockTexture(ModBlocks.JACK_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.KIWI_SIGN.get()), ((WallSignBlock) ModBlocks.KIWI_WALL_SIGN.get()),
                blockTexture(ModBlocks.KIWI_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.LEMON_SIGN.get()), ((WallSignBlock) ModBlocks.LEMON_WALL_SIGN.get()),
                blockTexture(ModBlocks.LEMON_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.MELON_SIGN.get()), ((WallSignBlock) ModBlocks.MELON_WALL_SIGN.get()),
                blockTexture(ModBlocks.MELON_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.NECTARINE_SIGN.get()), ((WallSignBlock) ModBlocks.NECTARINE_WALL_SIGN.get()),
                blockTexture(ModBlocks.NECTARINE_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.ORANGE_SIGN.get()), ((WallSignBlock) ModBlocks.ORANGE_WALL_SIGN.get()),
                blockTexture(ModBlocks.ORANGE_SIGN.get()));

        signBlock(((StandingSignBlock) ModBlocks.PEAR_SIGN.get()), ((WallSignBlock) ModBlocks.PEAR_WALL_SIGN.get()),
                blockTexture(ModBlocks.PEAR_SIGN.get()));





        hangingSignBlock(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
