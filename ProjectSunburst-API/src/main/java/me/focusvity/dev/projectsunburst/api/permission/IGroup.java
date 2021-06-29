package me.focusvity.dev.projectsunburst.api.permission;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.permissions.PermissionAttachment;

import java.util.List;

public interface IGroup
{

    /**
     * Gets the group name
     *
     * @return the name of the group
     */
    String getName();

    /**
     * Gets the group color
     *
     * @return the color of the group
     */
    ChatColor getColor();

    /**
     * Gets the group permissions
     *
     * @return the group permissions
     */
    List<PermissionAttachment> getPermissions();

    /**
     * Adds a permission node to the group
     *
     * @param node the permission node
     */
    void addPermission(String node);

    /**
     * Removes a permission node from the group
     *
     * @param node the permission node
     */
    void removePermission(String node);
}
