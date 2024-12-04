package dev.nibias.createmekanismmotor;

import net.minecraftforge.client.event.RenderHighlightEvent.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("createmekanismmotor")
public class CreateMekanismMotor {

    static final Logger LOGGER = LogManager.getFormatterLogger();
    static final Boolean DEV = Boolean.parseBoolean(System.getProperty("development", "false"));

    public CreateMekanismMotor() {
        var modBus = FMLJavaModLoadingContext.get().getModEventBus();
        var forgeEventBus = MinecraftForge.EVENT_BUS;
        forgeEventBus.addGenericListener(Entity.class, CreateMekanismMotor::forgeEventHandler);
    }


    private static void forgeEventHandler(AttachCapabilitiesEvent<Entity> event) {
        // ...
    }
}