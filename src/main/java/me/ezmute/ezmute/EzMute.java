package me.ezmute.ezmute;

import me.ezmute.ezmute.commands.commandMute;
import me.ezmute.ezmute.events.onPlayerChat;
import me.ezmute.ezmute.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class EzMute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Utils.log("&4Ez&3Mute");

        this.getCommand("mute").setExecutor(new commandMute());

        getServer().getPluginManager().registerEvents(new onPlayerChat(), this);

    }

}
