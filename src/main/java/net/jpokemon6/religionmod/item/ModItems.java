package net.jpokemon6.religionmod.item;

import net.jpokemon6.religionmod.ReligionMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReligionMod.MOD_ID);

    public static final RegistryObject<Item> CROSS = ITEMS.register("cross",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HOLY_CROSS = ITEMS.register("holy_cross",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HOLY_IRON = ITEMS.register("holy_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLY_GOLD = ITEMS.register("holy_gold",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
