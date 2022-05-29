package me.ezmute.ezmute;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class EzMute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println(Color.GREEN + "EzMute By hrdu_");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        // /-mute
        if (command.getName().equalsIgnoreCase("mute")) {

            if(sender instanceof Player p){

                p.sendMessage(ChatColor.GREEN + "Player Muted!");


            }else if (sender instanceof ConsoleCommandSender){

                System.out.println("This command can not be run from console.");

            }


        }

        return true;
    }
}
