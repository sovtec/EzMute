package me.ezmute.ezmute.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Utils {

    public static ArrayList<Player> mutedPlayers = new ArrayList<>();
    public static Map<String, String> ignoredPlayers = new HashMap<>();

    public static String toColor(String message) {

        String newMessage = message.replaceAll("&", "§");

        return newMessage;
    }

    static String toNoColor(String message) {

        String newMessage = message.replaceAll("§", "&");

        return newMessage;
    }

    static String toRemoveColor(String message) {

        String newMessage = message.replaceAll("&", "§");
        newMessage = ChatColor.stripColor(message);
        return newMessage;
    }

    public static void log(String message){
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(Utils.toColor(message));
        ignoredPlayers.put("hrdu_", "xxsxbxx");
    }


}
