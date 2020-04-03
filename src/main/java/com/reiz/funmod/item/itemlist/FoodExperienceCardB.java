package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class FoodExperienceCardB extends ItemFood{

	public FoodExperienceCardB() {
		super(4, 0.2F,true);
		this.setUnlocalizedName("experience_cardb");
		ForgeRegistries.ITEMS.register(this.setRegistryName("experience_cardb"));
		this.setCreativeTab(CreativeTabInit.REIZMOD);
		this.setAlwaysEdible();
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("��6This is Arknight's Basic Experience Card!");
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE));
			player.addExperience(15);
			player.sendMessage(new TextComponentString("��aYou ate the Basic Experience Card,Got 15 Exp!"));
		}
		super.onFoodEaten(stack, worldIn, player);
	}
}

