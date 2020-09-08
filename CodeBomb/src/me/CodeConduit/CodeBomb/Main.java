package me.CodeConduit.CodeBomb;

import me.CodeConduit.CodeBomb.ToolSmithing.listeners.ToolListen;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    //Runs when the plugin is enabled
    public void onEnable() {
        enableToolSmithing(true);
    }

    //Enables all of the classes in the ToolSmithing package
    public void enableToolSmithing(boolean enable) {
        new ToolListen(this);
    }
}
