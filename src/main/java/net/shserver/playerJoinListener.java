package net.shserver;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerJoinListener implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        var player = event.getPlayer();
        var player_location = player.getLocation();
        player.getWorld().playSound(player_location, Sound.ENTITY_PLAYER_LEVELUP, 1, 5);
        event.setJoinMessage(ChatColor.AQUA + "欢迎！" + ChatColor.AQUA + player.getName());
        event.setJoinMessage(ChatColor.YELLOW + "传送至他人" + ChatColor.WHITE + "/tpa <玩家名>" + ChatColor.YELLOW + "将他人传送至此处" + ChatColor.WHITE + "/tpahere <玩家名>");
    }
}
