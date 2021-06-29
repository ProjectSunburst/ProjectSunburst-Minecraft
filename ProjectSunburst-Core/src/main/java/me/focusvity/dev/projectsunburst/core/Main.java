package me.focusvity.dev.projectsunburst.core;

import me.focusvity.dev.projectsunburst.api.SunburstApi;
import me.focusvity.dev.projectsunburst.api.SunburstApiProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements SunburstApiProvider
{

    private static Main plugin;
    private Provider provider;

    @Override
    public void onEnable()
    {
        plugin = this;
        provider = new Provider();
    }

    @Override
    public void onDisable()
    {
        plugin = null;
    }

    @Override
    public SunburstApi getApi()
    {
        return provider;
    }
}
