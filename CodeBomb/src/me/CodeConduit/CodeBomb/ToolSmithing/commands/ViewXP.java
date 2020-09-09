package me.CodeConduit.CodeBomb.ToolSmithing.commands;

import me.CodeConduit.CodeBomb.Main;
import me.CodeConduit.CodeBomb.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("all")
public class ViewXP implements CommandExecutor {
    //Variables
    private Main plugin;

    //Standard constructor for commands
    public ViewXP(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("toolsmithXP").setExecutor(this);
    }

    //Command executor
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player player = (Player) sender;
        sender.sendMessage(Utils.chat("&6You have&a " + plugin.getPlayerDataConfig().get("players." + String.valueOf(player.getUniqueId()) + ".toolSmithEXP") + " EXP&6 and are at&a lvl " + plugin.getPlayerDataConfig().get("players." + String.valueOf(player.getUniqueId()) + ".toolSmithLevel") + "&6."));
        return true;
    }
}
