package me.CodeConduit.CodeBomb;

import me.CodeConduit.CodeBomb.ToolSmithing.listeners.ToolListen;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin implements Listener {
    private File playerdataFile = new File(getDataFolder(), "playerdata.yml");
    private FileConfiguration playerdataConfig = YamlConfiguration.loadConfiguration(playerdataFile);

    //Runs when the plugin is enabled
    public void onEnable() {
        if (!playerdataFile.exists()) {
            saveResource("playerdata.yml", false);
        }
        enableToolSmithing(true);
        new SavePlayer(this);
    }

    //Runs when the plugin is disabled
    public void onDisable() {
        try {
            getPlayerDataConfig().save(getPlayerDataFile());
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    //Enables all of the classes in the ToolSmithing package
    public void enableToolSmithing(boolean enable) {
        if (enable) {
            new ToolListen(this);
        }
    }

    //Getters for playerData
    public FileConfiguration getPlayerDataConfig() {
        return playerdataConfig;
    }
    public File getPlayerDataFile() {
        return playerdataFile;
    }
}
