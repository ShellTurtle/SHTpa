package net.shserver;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

public class tpaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NonNull CommandSender commandSender, org.bukkit.command.@NonNull Command command, @NonNull String s, String @NonNull [] strings) {
        Player player = Bukkit.getPlayer(strings[0]);
        Player sender = (Player) commandSender;
        var sender_location = sender.getLocation();
        if(player.isOnline() && sender != player) {
            sender.teleport(player.getLocation());
            player.getWorld().playSound(sender_location, Sound.ENTITY_PLAYER_LEVELUP, 1, 5);
            sender.sendMessage(ChatColor.AQUA + "已传送到" + ChatColor.YELLOW +player.getName());
            return true;
        }
        if(!player.isOnline()) {
            sender.sendMessage(ChatColor.AQUA + "无法传送到" + ChatColor.YELLOW +player.getName() + ChatColor.AQUA + "该玩家可能不在线");
        }
        if(sender == player) {
            sender.sendMessage(ChatColor.AQUA + "无法传送至自己！");
        }
        return false;
    }
}
