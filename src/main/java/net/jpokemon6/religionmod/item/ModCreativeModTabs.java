package net.jpokemon6.religionmod.item;

import net.jpokemon6.religionmod.ReligionMod;
import net.jpokemon6.religionmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReligionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RELIGION_TAB = CREATIVE_MODE_TABS.register("religion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOLY_CROSS.get()))
                    .title(Component.translatable("creativetab.religion_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CROSS.get());
                        output.accept(ModItems.HOLY_CROSS.get());
                        output.accept(ModItems.HOLY_IRON.get());
                        output.accept(ModItems.HOLY_GOLD.get());
                        output.accept(ModBlocks.HOLY_GOLD_BLOCK.get());
                        output.accept(ModBlocks.HOLY_IRON_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
