
package net.mcreator.gg.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.gg.itemgroup.TABHEEBSTFERIENItemGroup;
import net.mcreator.gg.GgModElements;

@GgModElements.ModElement.Tag
public class HEEBSTAXEItem extends GgModElements.ModElement {
	@ObjectHolder("gg:heebstaxe")
	public static final Item block = null;
	public HEEBSTAXEItem(GgModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HeebstferieningotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(TABHEEBSTFERIENItemGroup.tab)) {
		}.setRegistryName("heebstaxe"));
	}
}
