package me.focusvity.dev.projectsunburst.core;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

    private static Main plugin;

    @Override
    public void onEnable()
    {
        plugin = this;
    }

    @Override
    public void onDisable()
    {
        plugin = null;
    }
}