package com.quade.rhgreylist;

import org.bukkit.plugin.java.JavaPlugin;


public class Greylist extends JavaPlugin {
    public void onEnable() {
        getCommand("greylist").setExecutor(new GreylistCommands());
    }
}
