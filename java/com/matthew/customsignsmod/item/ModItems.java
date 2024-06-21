package com.matthew.customsignsmod.item;


import com.matthew.customsignsmod.CustomSignsMod;
import com.matthew.customsignsmod.block.ModBlocks;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomSignsMod.MOD_ID);

    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));

    public static final RegistryObject<Item> COOL_SIGN = ITEMS.register("cool_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.COOL_SIGN.get(), ModBlocks.COOL_WALL_SIGN.get()));

    public static final RegistryObject<Item> APPLE_SIGN = ITEMS.register("apple_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.APPLE_SIGN.get(), ModBlocks.APPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> BANANA_SIGN = ITEMS.register("banana_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BANANA_SIGN.get(), ModBlocks.BANANA_WALL_SIGN.get()));
    public static final RegistryObject<Item> CHERRY_SIGN = ITEMS.register("cherry_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CHERRY_SIGN.get(), ModBlocks.CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> DURIAN_SIGN = ITEMS.register("durian_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DURIAN_SIGN.get(), ModBlocks.DURIAN_WALL_SIGN.get()));

    public static final RegistryObject<Item> ELDER_SIGN = ITEMS.register("elder_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get()));

    public static final RegistryObject<Item> FIG_SIGN = ITEMS.register("fig_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.FIG_SIGN.get(), ModBlocks.FIG_WALL_SIGN.get()));

    public static final RegistryObject<Item> GRAPE_SIGN = ITEMS.register("grape_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRAPE_SIGN.get(), ModBlocks.GRAPE_WALL_SIGN.get()));

    public static final RegistryObject<Item> HONEY_SIGN = ITEMS.register("honey_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.HONEY_SIGN.get(), ModBlocks.HONEY_WALL_SIGN.get()));

    public static final RegistryObject<Item> IMBE_SIGN = ITEMS.register("imbe_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.IMBE_SIGN.get(), ModBlocks.IMBE_WALL_SIGN.get()));

    public static final RegistryObject<Item> JACK_SIGN = ITEMS.register("jack_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.JACK_SIGN.get(), ModBlocks.JACK_WALL_SIGN.get()));

    public static final RegistryObject<Item> KIWI_SIGN = ITEMS.register("kiwi_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.KIWI_SIGN.get(), ModBlocks.KIWI_WALL_SIGN.get()));

    public static final RegistryObject<Item> LEMON_SIGN = ITEMS.register("lemon_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LEMON_SIGN.get(), ModBlocks.LEMON_WALL_SIGN.get()));

    public static final RegistryObject<Item> MELON_SIGN = ITEMS.register("melon_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MELON_SIGN.get(), ModBlocks.MELON_WALL_SIGN.get()));

    public static final RegistryObject<Item> NECTARINE_SIGN = ITEMS.register("nectarine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.NECTARINE_SIGN.get(), ModBlocks.NECTARINE_WALL_SIGN.get()));

    public static final RegistryObject<Item> ORANGE_SIGN = ITEMS.register("orange_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ORANGE_SIGN.get(), ModBlocks.ORANGE_WALL_SIGN.get()));

    public static final RegistryObject<Item> PEAR_SIGN = ITEMS.register("pear_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEAR_SIGN.get(), ModBlocks.PEAR_WALL_SIGN.get()));




    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}

}
