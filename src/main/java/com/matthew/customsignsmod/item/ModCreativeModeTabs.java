package com.matthew.customsignsmod.item;


import com.matthew.customsignsmod.CustomSignsMod;
import com.matthew.customsignsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CustomSignsMod.MOD_ID);



    public static final RegistryObject<CreativeModeTab> CUSTOM_SIGNS = CREATIVE_MODE_TABS.register("customsigns",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PINE_SIGN.get()))
                    .title(Component.translatable("creativetab.customsigns"))
                    .displayItems((pParameters, pOutput)->{

                        pOutput.accept(ModBlocks.PINE_SIGN.get());

                        pOutput.accept(ModBlocks.COOL_SIGN.get());

                        pOutput.accept(ModBlocks.APPLE_SIGN.get());
                        pOutput.accept(ModBlocks.BANANA_SIGN.get());
                        pOutput.accept(ModBlocks.CHERRY_SIGN.get());
                        pOutput.accept(ModBlocks.DURIAN_SIGN.get());

                        pOutput.accept(ModBlocks.ELDER_SIGN.get());
                        pOutput.accept(ModBlocks.FIG_SIGN.get());
                        pOutput.accept(ModBlocks.GRAPE_SIGN.get());
                        pOutput.accept(ModBlocks.HONEY_SIGN.get());
                        pOutput.accept(ModBlocks.IMBE_SIGN.get());
                        pOutput.accept(ModBlocks.JACK_SIGN.get());
                        pOutput.accept(ModBlocks.KIWI_SIGN.get());
                        pOutput.accept(ModBlocks.LEMON_SIGN.get());
                        pOutput.accept(ModBlocks.MELON_SIGN.get());
                        pOutput.accept(ModBlocks.NECTARINE_SIGN.get());
                        pOutput.accept(ModBlocks.ORANGE_SIGN.get());
                        pOutput.accept(ModBlocks.PEAR_SIGN.get());


                        pOutput.accept(ModBlocks.PINE_HANGING_SIGN.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
