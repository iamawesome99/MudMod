package iam.mud.objects.items;

import iam.mud.Main;
import iam.mud.init.ItemInit;
import iam.mud.util.IHasModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class MudPie extends ItemFood implements IHasModel {

    public MudPie(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.mudTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if(!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.POISON, 60*5, 1, false, true));
        }
    }

    @Override
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
