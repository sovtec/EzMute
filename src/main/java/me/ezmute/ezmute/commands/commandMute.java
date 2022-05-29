package me.ezmute.ezmute.commands;

import me.ezmute.ezmute.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class commandMute implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            try {
                // Get player to mute's username from first argument
                String playerToMuteUsername = args[0];

                // Define player from username
                Player playerToMute = Bukkit.getPlayerExact(playerToMuteUsername);

                // Check if player is already muted
                if (Utils.mutedPlayers.contains(playerToMute)) {
                    // Player is muted already, unmute
                    Utils.mutedPlayers.remove(playerToMute);
                    Utils.log("&b" + playerToMute.getName() + " &3has now been unmuted!");
                    Utils.log(Utils.mutedPlayers.toString());
                } else {
                    // Player is not muted, mute their ass.
                    Utils.mutedPlayers.add(playerToMute);
                    Utils.log("&b" + playerToMute.getName() + " &3has now been muted!");
                    Utils.log(Utils.mutedPlayers.toString());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                Utils.log("&4This command requires a player username");
            }

        } else{
            Utils.log("&4This command can only be executed by a player!");
        }

        return true;
    }
}
