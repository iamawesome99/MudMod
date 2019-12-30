package iam.mud.init;

import iam.mud.objects.ItemBase;
import iam.mud.objects.items.MudPie;
import iam.mud.objects.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static List<Item> ITEMS = new ArrayList<>();

    public static final Item.ToolMaterial TOOL_MUD = EnumHelper.addToolMaterial("tool_mud", 0, 16, 0.4f, 2, 10);

    public static final Item MUD_INGOT = new ItemBase("mud_ingot");
    public static final Item MUD_PIE = new MudPie("mud_pie", 1, 0, false);

    public static final Item MUD_SWORD = new ToolSword("mud_sword", TOOL_MUD);
    public static final Item MUD_HOE = new ToolHoe("mud_hoe", TOOL_MUD);
    public static final Item MUD_SHOVEL = new ToolShovel("mud_shovel", TOOL_MUD);
    public static final Item MUD_AXE = new ToolAxe("mud_axe", TOOL_MUD);
    public static final Item MUD_PICKAXE = new ToolPickaxe("mud_pickaxe", TOOL_MUD);
}
