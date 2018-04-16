package com.github.almightywaffle.economy;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.pocketkid2.database.Database;

public class EconomyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Database.register(this);
    }

    @Override
    public void onDisable() {

    }
}
