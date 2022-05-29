package me.ezmute.ezmute.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class onPlayerJoinEvent implements Listener {

    //This is said in console when a player enters game.
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        System.out.println("Player joined game");

    }

    @EventHandler
    public void onleaveBed(PlayerBedEnterEvent event) {

        Player player = event.getPlayer();
        player.sendMessage("SLEEP TIGHT BITCH!");

    }

}
