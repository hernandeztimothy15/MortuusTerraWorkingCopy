package me.wickersty.mortuusterra.objects;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SupplyDropContentsObject {
	
	public ItemStack itemId;
	public Integer itemQuantity;
	public Double itemChance;

	public SupplyDropContentsObject(ItemStack itemId2, Integer itemQuantity, double itemChance) {
		
		this.itemId = itemId2;
		this.itemQuantity = itemQuantity;
		this.itemChance = itemChance;
		
	}
	
}
