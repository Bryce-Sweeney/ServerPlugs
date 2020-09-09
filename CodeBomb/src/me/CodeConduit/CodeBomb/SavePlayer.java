package me.CodeConduit.CodeBomb;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;

public class SavePlayer implements Listener {

    //Variables
    private Main plugin;

    //Standard constructor for listeners
    public SavePlayer(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    //Join event
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        plugin.getPlayerDataConfig().set("players." + e.getPlayer().getUniqueId() + ".name", e.getPlayer().getName());
        if (plugin.getPlayerDataConfig().get("players." + e.getPlayer().getUniqueId()) == null) {
            plugin.getPlayerDataConfig().set("players." + e.getPlayer().getUniqueId() + ".toolSmithEXP", 0);
            plugin.getPlayerDataConfig().set("players." + e.getPlayer().getUniqueId() + ".toolSmithLevel", 0);
        }
        try {
            plugin.getPlayerDataConfig().save(plugin.getPlayerDataFile());
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
