package net.skydimondlox.yeetmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.skydimondlox.yeetmod.Yeetmod;

@Mod.EventBusSubscriber(modid = Yeetmod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab YEET_TAB;

    @SubscribeEvent
    public static void  registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        YEET_TAB = event.registerCreativeModeTab(new ResourceLocation(Yeetmod.MOD_ID, "yeet_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get()))
                        .title(Component.translatable("creativemodetab.yeet_tab")));
    }
}
