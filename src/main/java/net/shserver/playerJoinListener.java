package net.shserver;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class playerJoinListener implements Listener {
    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        var player_location = player.getLocation();
        player.getWorld().playSound(player_location, Sound.ENTITY_PLAYER_LEVELUP, 1, 5);
        player.sendMessage(ChatColor.AQUA + "欢迎！" + ChatColor.YELLOW + player.getName());
        player.sendMessage(ChatColor.AQUA + "传送至他人" + ChatColor.YELLOW + "/tpa <玩家名>" + ChatColor.AQUA + "将他人传送至此处" + ChatColor.YELLOW + "/tpahere <玩家名>");
    }
}
