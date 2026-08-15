package com.example;

import dev.anvilcraft.lib.v2.registrum.Registrum;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(AnvilCraftExampleAddon.MOD_ID)
public class AnvilCraftExampleAddon {
    public static final String MOD_ID = "anvilcraft_example_addon";
    public static final String MOD_NAME = "Anvilcraft: Example Addon";
    public static final Registrum REGISTRUM = Registrum.create(AnvilCraftExampleAddon.MOD_ID);

    public AnvilCraftExampleAddon(IEventBus modEventBus, ModContainer container) {
    }
}
