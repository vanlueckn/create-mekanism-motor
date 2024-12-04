package dev.nibias.createmekanismmotor;

import static com.simibubi.create.Create.REGISTRATE;
import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.client.event.RenderHighlightEvent.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreateMekanismMotor.MODID)
public class CreateMekanismMotor {

    static final String MODID = "createmekanismmotor";

    static final Logger LOGGER = LogManager.getFormatterLogger(MODID);
    static final Boolean DEV = Boolean.parseBoolean(System.getProperty("development", "false"));


    public static final CreateRegistrate BASE_REGISTRATE = CreateRegistrate.create(MOD_ID);


    private static DeferredRegister<CreativeModeTab> TAB_REGISTRAR = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> tab = TAB_REGISTRAR.register("create_mekanism_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group." + MOD_ID + ".tab"))
            .icon(() -> new ItemStack(Items.DIAMOND))
            .build()
    );

    public static final CreateRegistrate REGISTRATE = BASE_REGISTRATE.setCreativeTab(tab);


    public static final ResourceKey<CreativeModeTab> CREATIVE_TAB_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB,
        new ResourceLocation(MOD_ID, "create_mekanism_tab"));






    public CreateMekanismMotor() {

        var modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BASE_REGISTRATE.registerEventListeners(modBus);
        TAB_REGISTRAR.register(modBus);


        CreateMekanismMotorBlocks.load();
        CreateMekanismMotorEntityTypes.load();

    }


}