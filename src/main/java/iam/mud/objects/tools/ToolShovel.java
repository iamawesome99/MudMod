package iam.mud.objects.tools;

import iam.mud.Main;
import iam.mud.init.ItemInit;
import iam.mud.util.IHasModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;

public class ToolShovel extends ItemSpade implements IHasModel {

    public ToolShovel(String name, ToolMaterial material) {
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
