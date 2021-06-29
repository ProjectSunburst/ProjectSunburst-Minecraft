package me.focusvity.dev.projectsunburst.api.permission;

import java.util.List;

public interface IGroupManager
{

    /**
     * Gets all groups available
     *
     * @return the list of the groups available
     */
    List<IGroup> getGroups();
}
