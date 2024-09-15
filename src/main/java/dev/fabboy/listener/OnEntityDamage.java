package dev.fabboy.listener;

import org.bukkit.event.Listener;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.Location;

public class OnEntityDamage implements Listener {
  @EventHandler
  public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
    if(event.getDamager() instanceof Player) {
      Player damager = (Player) event.getDamager();
      Entity target = event.getEntity();
      Location location = target.getLocation();
      // double healthLeft = target.getHealth() - event.getFinalDamage()

      String message = ChatColor.GOLD + "Attacker: " + damager.getName() + 
                       "\n Entity: " + target.getType().name() + 
                       "\n At X=" + location.getBlockX() + ", Y=" + location.getBlockY() + ", Z=" + location.getBlockZ();
      damager.sendMessage(message);
    }
  }
} 
