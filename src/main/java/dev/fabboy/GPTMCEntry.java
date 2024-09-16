package dev.fabboy;

import dev.fabboy.listener.OnEntityDamage;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;

public class GPTMCEntry extends JavaPlugin {
  private static Logger logger;
  private static Server server;
  private static PluginManager PManager;

  @Override
  public void onEnable() {
    logger = getLogger();
    server = getServer();
    PManager = server.getPluginManager();
    logger.info("GPTMC is now running!");
    this.registerEventHandlers();
  }

  public void registerEventHandlers() {
    PManager.registerEvents(new OnEntityDamage(), this);
  }

  @Override
  public void onDisable() {
    getLogger().info("GPTMC is shutting down!");
  }
}
