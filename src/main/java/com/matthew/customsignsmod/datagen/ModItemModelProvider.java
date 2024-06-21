package com.matthew.customsignsmod.datagen;

import com.matthew.customsignsmod.CustomSignsMod;

import com.matthew.customsignsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;


public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CustomSignsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PINE_SIGN);
        simpleItem(ModItems.PINE_HANGING_SIGN);
        simpleItem(ModItems.COOL_SIGN);


        simpleItem(ModItems.APPLE_SIGN);
        simpleItem(ModItems.BANANA_SIGN);
        simpleItem(ModItems.CHERRY_SIGN);
        simpleItem(ModItems.DURIAN_SIGN);

        simpleItem(ModItems.ELDER_SIGN);
        simpleItem(ModItems.FIG_SIGN);
        simpleItem(ModItems.GRAPE_SIGN);
        simpleItem(ModItems.HONEY_SIGN);
        simpleItem(ModItems.IMBE_SIGN);
        simpleItem(ModItems.JACK_SIGN);
        simpleItem(ModItems.KIWI_SIGN);
        simpleItem(ModItems.LEMON_SIGN);
        simpleItem(ModItems.MELON_SIGN);
        simpleItem(ModItems.NECTARINE_SIGN);
        simpleItem(ModItems.ORANGE_SIGN);
        simpleItem(ModItems.PEAR_SIGN);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CustomSignsMod.MOD_ID,"item/" + item.getId().getPath()));

    }
}
