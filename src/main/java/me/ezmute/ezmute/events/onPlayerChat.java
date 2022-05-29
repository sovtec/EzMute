package me.ezmute.ezmute.events;

import me.ezmute.ezmute.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onPlayerChat implements Listener {

    @EventHandler
    public void onPlayerChat (AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        if (Utils.mutedPlayers.contains(player)) {
            e.setCancelled(true);
        }
    }
}
