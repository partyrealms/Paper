package org.bukkit.craftbukkit.block.impl;

import com.google.common.base.Preconditions;
import io.papermc.paper.generated.GeneratedFrom;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import org.bukkit.block.data.type.Slab;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

@GeneratedFrom("1.21.8")
public class CraftSlab extends CraftBlockData implements Slab {
    private static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;

    private static final BooleanProperty WATERLOGGED = SlabBlock.WATERLOGGED;

    public CraftSlab(BlockState state) {
        super(state);
    }

    @Override
    public Slab.Type getType() {
        return this.get(TYPE, Slab.Type.class);
    }

    @Override
    public void setType(final Slab.Type type) {
        Preconditions.checkArgument(type != null, "type cannot be null!");
        this.set(TYPE, type);
    }

    @Override
    public boolean isWaterlogged() {
        return this.get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(final boolean waterlogged) {
        this.set(WATERLOGGED, waterlogged);
    }
}
