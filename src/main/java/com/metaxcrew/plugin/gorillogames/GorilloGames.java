package com.metaxcrew.plugin.gorillogames;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GorilloGames extends JavaPlugin {

    @Override
    public void onEnable() {

        //Startup message
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]=================[" + ChatColor.of("#44eeff") + ChatColor.BOLD + "GorilloGames" + ChatColor.GRAY + "]=================[]");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of("#406266") + "       Made by:" + ChatColor.of("#1da7b6") + " Mat");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "|" + ChatColor.of("#406266") + "       Discord:" + ChatColor.of("#1da7b6") + " PxLib#0001");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "[]==================================================[]");



    }

    @Override
    public void onDisable() {

    }
}
