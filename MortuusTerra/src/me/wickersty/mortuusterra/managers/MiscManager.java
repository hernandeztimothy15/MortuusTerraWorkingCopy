package me.wickersty.mortuusterra.managers;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import me.wickersty.mortuusterra.MortuusTerra;

public class MiscManager {
	
	private final MortuusTerra instance;
	
	public MiscManager(MortuusTerra instance) {
		
		this.instance = instance;
		
	}

	public void clearDrops(Player player, World world) {

		for (Entity e : world.getEntities()) {
			
			if (e instanceof Item) {
				
				e.remove();
				
			}
			
		}
	
		player.sendMessage(ChatColor.DARK_RED + "[Mortuus Terra] " + ChatColor.GRAY + "Drops Removed");
		
	}
	
}
