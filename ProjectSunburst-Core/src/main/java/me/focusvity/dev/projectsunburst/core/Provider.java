package me.focusvity.dev.projectsunburst.core;

import me.focusvity.dev.projectsunburst.api.SunburstApi;
import me.focusvity.dev.projectsunburst.api.permission.IGroupManager;

public class Provider implements SunburstApi
{

    @Override
    public IGroupManager getGroupManager()
    {
        return null;
    }
}
