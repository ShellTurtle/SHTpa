package net.shserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class shtpa extends JavaPlugin {

    public final Logger logger = getLogger();
    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("插件加载完成");
        Bukkit.getServer().getPluginManager().registerEvents(new playerJoinListener(),this);
        Bukkit.getPluginCommand("tpa").setExecutor(new tpaCommand());
        Bukkit.getPluginCommand("tpahere").setExecutor(new tpahereCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
