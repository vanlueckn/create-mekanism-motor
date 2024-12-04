package dev.nibias.createmekanismmotor.block;

import com.simibubi.create.content.kinetics.base.IRotate;
import com.simibubi.create.foundation.block.IBE;
import dev.nibias.createmekanismmotor.CreateMekanismMotorEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TurbineRotationalOutput extends Block implements IRotate, IBE<TurbineRotationalOutputEntity> {

    public TurbineRotationalOutput(Properties p) {
        super(p);
    }

    @Override
    public boolean hasShaftTowards(LevelReader levelReader, BlockPos blockPos, BlockState blockState, Direction direction) {
        return false;
    }

    @Override
    public Axis getRotationAxis(BlockState blockState) {
        return null;
    }

    @Override
    public Class<TurbineRotationalOutputEntity> getBlockEntityClass() {
        return TurbineRotationalOutputEntity.class;
    }

    @Override
    public BlockEntityType<? extends TurbineRotationalOutputEntity> getBlockEntityType() {
        return CreateMekanismMotorEntityTypes.TURBINE_ROTATIONAL_OUTPUT_ENTITY_BLOCK_ENTITY_ENTRY.get();
    }

    @Override
    public SpeedLevel getMinimumRequiredSpeedLevel() {
        return SpeedLevel.NONE;
    }



}
