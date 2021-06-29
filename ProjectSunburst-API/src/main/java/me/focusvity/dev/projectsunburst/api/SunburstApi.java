package me.focusvity.dev.projectsunburst.api;

import me.focusvity.dev.projectsunburst.api.permission.IGroupManager;

public interface SunburstApi
{

    /**
     * Gets the group manager
     *
     * @return the instance of the group manager
     */
    IGroupManager getGroupManager();
}
