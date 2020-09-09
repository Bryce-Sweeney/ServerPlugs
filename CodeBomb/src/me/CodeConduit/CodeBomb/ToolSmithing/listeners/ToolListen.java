package me.CodeConduit.CodeBomb.ToolSmithing.listeners;

import me.CodeConduit.CodeBomb.Main;
import me.CodeConduit.CodeBomb.Utils;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

import java.awt.*;
import java.io.IOException;

import static org.bukkit.Sound.ENTITY_EXPERIENCE_ORB_PICKUP;

@SuppressWarnings("all")
public class ToolListen implements Listener {

    //Variables
    private Main plugin;
    private short durabilityList[] = {59, 131, 250, 32, 1561, 2031};

    //This is a terrible way to list out all of the ItemStacks ... too bad!
    private ItemStack wPick = new ItemStack(Material.WOODEN_PICKAXE);
    private ItemStack sPick = new ItemStack(Material.STONE_PICKAXE);
    private ItemStack iPick = new ItemStack(Material.IRON_PICKAXE);
    private ItemStack gPick = new ItemStack(Material.GOLDEN_PICKAXE);
    private ItemStack dPick = new ItemStack(Material.DIAMOND_PICKAXE);
    private ItemStack wAxe = new ItemStack(Material.WOODEN_AXE);
    private ItemStack sAxe = new ItemStack(Material.STONE_AXE);
    private ItemStack iAxe = new ItemStack(Material.IRON_AXE);
    private ItemStack gAxe = new ItemStack(Material.GOLDEN_AXE);
    private ItemStack dAxe = new ItemStack(Material.DIAMOND_AXE);
    private ItemStack wHoe = new ItemStack(Material.WOODEN_HOE);
    private ItemStack sHoe = new ItemStack(Material.STONE_HOE);
    private ItemStack iHoe = new ItemStack(Material.IRON_HOE);
    private ItemStack gHoe = new ItemStack(Material.GOLDEN_HOE);
    private ItemStack dHoe = new ItemStack(Material.DIAMOND_HOE);
    private ItemStack wShovel = new ItemStack(Material.WOODEN_SHOVEL);
    private ItemStack sShovel = new ItemStack(Material.STONE_SHOVEL);
    private ItemStack iShovel = new ItemStack(Material.IRON_SHOVEL);
    private ItemStack gShovel = new ItemStack(Material.GOLDEN_SHOVEL);
    private ItemStack dShovel = new ItemStack(Material.DIAMOND_SHOVEL);
    private ItemStack wSword = new ItemStack(Material.WOODEN_SWORD);
    private ItemStack sSword = new ItemStack(Material.STONE_SWORD);
    private ItemStack iSword = new ItemStack(Material.IRON_SWORD);
    private ItemStack gSword = new ItemStack(Material.GOLDEN_SWORD);
    private ItemStack dSword = new ItemStack(Material.DIAMOND_SWORD);

    //Standard constructor for listeners
    public ToolListen(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    //Methods
    public short durabilityCalculate(int durLevel) {
        return (short) (durabilityList[durLevel] - durabilityList[durLevel]*Math.random());
    }

    //Listener for this class
    @EventHandler
    public void onCraft(CraftItemEvent e) {
        //Get the players toolsmithing xp and set it to a variable
        int playerXP = (int) plugin.getPlayerDataConfig().get("players." + String.valueOf(e.getWhoClicked().getUniqueId()) + ".toolSmithEXP");

        //Compare the recipe to every single ItemStack here ... also inefficient ... too bad!
        if (e.getInventory().getResult().equals(wPick)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(0)); //Pickaxes
            playerXP += 1;
        } else if (e.getInventory().getResult().equals(sPick)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(1));
            playerXP += 5;
        } else if (e.getInventory().getResult().equals(iPick)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(2));
            playerXP += 25;
        } else if (e.getInventory().getResult().equals(gPick)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(3));
            playerXP += 225;
        } else if (e.getInventory().getResult().equals(dPick)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(4));
            playerXP += 600;
        } else if (e.getInventory().getResult().equals(wAxe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(0)); //Axes
            playerXP += 1;
        } else if (e.getInventory().getResult().equals(sAxe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(1));
            playerXP += 5;
        } else if (e.getInventory().getResult().equals(iAxe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(2));
            playerXP += 25;
        } else if (e.getInventory().getResult().equals(gAxe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(3));
            playerXP += 225;
        } else if (e.getInventory().getResult().equals(dAxe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(4));
            playerXP += 600;
        } else if (e.getInventory().getResult().equals(wHoe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(0)); //Hoes
            playerXP += 1;
        } else if (e.getInventory().getResult().equals(sHoe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(1));
            playerXP += 5;
        } else if (e.getInventory().getResult().equals(iHoe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(2));
            playerXP += 25;
        } else if (e.getInventory().getResult().equals(gHoe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(3));
            playerXP += 225;
        } else if (e.getInventory().getResult().equals(dHoe)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(4));
            playerXP += 600;
        } else if (e.getInventory().getResult().equals(wShovel)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(0)); //Shovels
            playerXP += 1;
        } else if (e.getInventory().getResult().equals(sShovel)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(1));
            playerXP += 5;
        } else if (e.getInventory().getResult().equals(iShovel)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(2));
            playerXP += 25;
        } else if (e.getInventory().getResult().equals(gShovel)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(3));
            playerXP += 225;
        } else if (e.getInventory().getResult().equals(dShovel)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(4));
            playerXP += 600;
        } else if (e.getInventory().getResult().equals(wSword)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(0)); //Swords
            playerXP += 1;
        } else if (e.getInventory().getResult().equals(sSword)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(1));
            playerXP += 5;
        } else if (e.getInventory().getResult().equals(iSword)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(2));
            playerXP += 25;
        } else if (e.getInventory().getResult().equals(gSword)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(3));
            playerXP += 225;
        } else if (e.getInventory().getResult().equals(dSword)) {
            e.getInventory().getResult().setDurability(durabilityCalculate(4));
            playerXP += 600;
        }

        //Displaying xp received
        int playerXPgain = playerXP - (int) plugin.getPlayerDataConfig().get("players." + e.getWhoClicked().getUniqueId() + ".toolSmithEXP");
        Player player = (Player) e.getWhoClicked();
        e.getWhoClicked().sendMessage(Utils.chat("&6Toolsmithing EXP gain!&c " + playerXP + " XP (&a+" + playerXPgain + " XP&c)"));
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 2.0f);

        //Saving to playerdata file
        plugin.getPlayerDataConfig().set("players." + String.valueOf(e.getWhoClicked().getUniqueId()) + ".toolSmithEXP", playerXP);
        try {
            plugin.getPlayerDataConfig().save(plugin.getPlayerDataFile());
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}