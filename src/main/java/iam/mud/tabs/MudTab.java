package iam.mud.tabs;

import iam.mud.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MudTab extends CreativeTabs {

    public MudTab(String label){
        super("mudtab");
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ItemInit.MUD_INGOT);
    }

}
