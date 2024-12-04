package dev.nibias.createmekanismmotor;


import static dev.nibias.createmekanismmotor.CreateMekanismMotor.CREATIVE_TAB_KEY;
import static dev.nibias.createmekanismmotor.CreateMekanismMotor.REGISTRATE;


import com.tterrag.registrate.util.entry.BlockEntry;
import dev.nibias.createmekanismmotor.block.TurbineRotationalOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.RegistryObject;

public class CreateMekanismMotorBlocks {
    static {
        REGISTRATE.defaultCreativeTab(CREATIVE_TAB_KEY);
    }

    public static final BlockEntry<TurbineRotationalOutput> TURBINE_ROTATIONAL_OUTPUT = REGISTRATE.block("turbine_rotational_output",
        TurbineRotationalOutput::new)
        .properties(p -> BlockBehaviour.Properties.of().strength(3.0F).mapColor(MapColor.DIAMOND))
        .simpleItem()
        .register();


    public static void load() {
        // REGISTRATE.register("turbinerotationaloutput", () -> new TurbineRotationalOutput());
    }

}
