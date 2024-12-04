package dev.nibias.createmekanismmotor;

import static dev.nibias.createmekanismmotor.CreateMekanismMotor.REGISTRATE;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import dev.nibias.createmekanismmotor.block.TurbineRotationalOutputEntity;

public class CreateMekanismMotorEntityTypes {

    public static final BlockEntityEntry<TurbineRotationalOutputEntity> TURBINE_ROTATIONAL_OUTPUT_ENTITY_BLOCK_ENTITY_ENTRY = REGISTRATE
        .blockEntity("turbinerotationaloutput", TurbineRotationalOutputEntity::new)
        .validBlocks(CreateMekanismMotorBlocks.TURBINE_ROTATIONAL_OUTPUT)
        .register();


    public static void load() {}
}
