package iam.mud.objects.tools;

import iam.mud.Main;
import iam.mud.init.ItemInit;
import iam.mud.util.IHasModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;

public class ToolAxe extends ItemAxe implements IHasModel {

    public ToolAxe(String name, ToolMaterial material) {
        super(material);
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
