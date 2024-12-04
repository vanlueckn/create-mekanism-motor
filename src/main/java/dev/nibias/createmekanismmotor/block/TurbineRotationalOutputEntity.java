package dev.nibias.createmekanismmotor.block;

import com.simibubi.create.content.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.content.kinetics.base.GeneratingKineticBlockEntity;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TurbineRotationalOutputEntity extends GeneratingKineticBlockEntity implements IHaveGoggleInformation {

    public TurbineRotationalOutputEntity(BlockEntityType<?> type, BlockPos pos,
        BlockState state) {
        super(type, pos, state);
    }

    @Override
    public float getGeneratedSpeed() {
        return 10;
    }

    @Override
    public float calculateStressApplied() {
        return 0;
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {

        tooltip.add(Component.nullToEmpty("Speed: " + getGeneratedSpeed()));
        tooltip.add(Component.nullToEmpty("Stress Capacity: " + calculateStressApplied()));

        super.addToGoggleTooltip(tooltip, isPlayerSneaking);
        return true;
    }

    @Override
    public void tick() {
        super.tick();
    }



}
