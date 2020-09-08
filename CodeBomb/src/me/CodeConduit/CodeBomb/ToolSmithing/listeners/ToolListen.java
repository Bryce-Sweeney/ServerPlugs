package me.CodeConduit.CodeBomb.ToolSmithing.listeners;

import me.CodeConduit.CodeBomb.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

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
    private ItemStack dPick = new ItemStack(Material.WOODEN_PICKAXE);
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

    //Listener for this class
    @EventHandler
    public void onCraft(CraftItemEvent e) {
        //Compare the recipe to every single ItemStack here ... also inefficient ... too bad!
        if (e.getInventory().getResult().equals(wPick)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[0] - durabilityList[0]*Math.random())); //Pickaxes
        } else if (e.getInventory().getResult().equals(sPick)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[1] - durabilityList[1]*Math.random()));
        } else if (e.getInventory().getResult().equals(iPick)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[2] - durabilityList[2]*Math.random()));
        } else if (e.getInventory().getResult().equals(gPick)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[3] - durabilityList[3]*Math.random()));
        } else if (e.getInventory().getResult().equals(dPick)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[4] - durabilityList[4]*Math.random()));
        } else if (e.getInventory().getResult().equals(wAxe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[0] - durabilityList[0]*Math.random())); //Axes
        } else if (e.getInventory().getResult().equals(sAxe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[1] - durabilityList[1]*Math.random()));
        } else if (e.getInventory().getResult().equals(iAxe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[2] - durabilityList[2]*Math.random()));
        } else if (e.getInventory().getResult().equals(gAxe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[3] - durabilityList[3]*Math.random()));
        } else if (e.getInventory().getResult().equals(dAxe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[4] - durabilityList[4]*Math.random()));
        } else if (e.getInventory().getResult().equals(wHoe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[0] - durabilityList[0]*Math.random())); //Hoes
        } else if (e.getInventory().getResult().equals(sHoe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[1] - durabilityList[1]*Math.random()));
        } else if (e.getInventory().getResult().equals(iHoe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[2] - durabilityList[2]*Math.random()));
        } else if (e.getInventory().getResult().equals(gHoe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[3] - durabilityList[3]*Math.random()));
        } else if (e.getInventory().getResult().equals(dHoe)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[4] - durabilityList[4]*Math.random()));
        } else if (e.getInventory().getResult().equals(wShovel)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[0] - durabilityList[0]*Math.random())); //Shovels
        } else if (e.getInventory().getResult().equals(sShovel)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[1] - durabilityList[1]*Math.random()));
        } else if (e.getInventory().getResult().equals(iShovel)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[2] - durabilityList[2]*Math.random()));
        } else if (e.getInventory().getResult().equals(gShovel)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[3] - durabilityList[3]*Math.random()));
        } else if (e.getInventory().getResult().equals(dShovel)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[4] - durabilityList[4]*Math.random()));
        } else if (e.getInventory().getResult().equals(wSword)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[0] - durabilityList[0]*Math.random())); //Swords
        } else if (e.getInventory().getResult().equals(sSword)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[1] - durabilityList[1]*Math.random()));
        } else if (e.getInventory().getResult().equals(iSword)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[2] - durabilityList[2]*Math.random()));
        } else if (e.getInventory().getResult().equals(gSword)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[3] - durabilityList[3]*Math.random()));
        } else if (e.getInventory().getResult().equals(dSword)) {
            e.getInventory().getResult().setDurability((short) (durabilityList[4] - durabilityList[4]*Math.random()));
        }
    }
}