package me.ezmute.ezmute;

import me.ezmute.ezmute.events.onPlayerJoinEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EzMute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("EzMute Loaded.");

        getServer().getPluginManager().registerEvents(new onPlayerJoinEvent(), this);
    }



}
