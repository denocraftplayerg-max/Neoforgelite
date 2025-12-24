package com.teumod.neoforgelite;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NeoForgeLite.MODID)
public class NeoForgeLite {

    public static final String MODID = "neoforgelite";

    public NeoForgeLite() {
        FMLJavaModLoadingContext.get().getModEventBus()
                .addListener(this::onClientSetup);
    }

    private void onClientSetup(final FMLClientSetupEvent event) {
        // Aqui entram as otimizações de cliente (render/GUI)
        System.out.println("[NeoForgeLite] Client setup loaded");
    }
}
