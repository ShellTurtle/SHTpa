package net.shserver;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

public class tpahereCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NonNull CommandSender commandSender, org.bukkit.command.@NonNull Command command, @NonNull String s, String @NonNull [] strings) {
        Player player = Bukkit.getPlayer(strings[0]);
        Player sender = Bukkit.getPlayer(commandSender.getName());
        var sneder_location = sender.getLocation();
        if(player.isOnline() && sender != player) {
            player.teleport(sender.getLocation());
            player.getWorld().playSound(sneder_location, Sound.ENTITY_PLAYER_LEVELUP, 1, 5);
            sender.sendMessage(ChatColor.AQUA + "已将" + ChatColor.YELLOW + player.getName() + ChatColor.AQUA +"此处");
            return true;
        }

        else {
            if (sender == player) {
                sender.sendMessage(ChatColor.AQUA + "无法传送至自己！");
            }

            else {
                sender.sendMessage(ChatColor.AQUA + "无法将" + ChatColor.YELLOW + player.getName() + ChatColor.AQUA + "传送到此处，该玩家可能不存在");
            }
            return true;
        }
    }
}
