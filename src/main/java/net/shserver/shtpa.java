package net.shserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class shtpa extends JavaPlugin {

    public final Logger logger = getLogger();
    @Override
    public void onEnable() {
        // 插件加载
        logger.info("插件加载完成");
        Bukkit.getServer().getPluginManager().registerEvents(new playerJoinListener(),this);
        Bukkit.getPluginCommand("tpa").setExecutor(new tpaCommand());
        Bukkit.getPluginCommand("tpahere").setExecutor(new tpahereCommand());

    }

    @Override
    public void onDisable() {
        // 插件卸载
    }
}
