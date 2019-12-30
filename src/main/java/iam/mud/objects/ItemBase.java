package iam.mud.objects;

import iam.mud.Main;
import iam.mud.init.ItemInit;
import iam.mud.util.IHasModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.mudTab);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
