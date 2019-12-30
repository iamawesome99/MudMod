package iam.mud.init;

import iam.mud.objects.blocks.Mud;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static List<Block> BLOCKS = new ArrayList<>();

    public static final Block MUD = new Mud("mud", Material.GROUND);
}
