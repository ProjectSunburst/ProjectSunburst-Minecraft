package me.focusvity.dev.projectsunburst.api.player;

import me.focusvity.dev.projectsunburst.api.ban.IBan;
import me.focusvity.dev.projectsunburst.api.permission.IGroup;
import org.bukkit.permissions.PermissionAttachment;

import java.util.List;
import java.util.UUID;

public interface IPlayer
{

    /**
     * Sends a message to the player
     *
     * @param message a message to send to the player
     */
    void message(String message);

    /**
     * Checks if the player is banned
     *
     * @return the current status of ban
     */
    boolean isBanned();

    /**
     * Gets the player's current ban if available
     *
     * @return the player's current ban if applicable
     * @see IBan
     */
    IBan getCurrentBan();

    /**
     * Gets the player's ban list
     *
     * @return the player's ban list
     */
    List<IBan> getBans();

    /**
     * Gets the player's specific ban
     *
     * @param banId the identifier of the ban
     * @return the ban by identifier
     * @see IBan
     */
    IBan getBan(String banId);

    /**
     * Checks if the player is muted
     *
     * @return the current status of mute
     */
    boolean isMuted();

    /**
     * Gets the player's primary group
     *
     * @return the player's primary group
     * @see IGroup
     */
    IGroup getPrimaryGroup();

    /**
     * Sets the player's primary group
     *
     * @param group the group to set as primary
     */
    void setPrimaryGroup(IGroup group);

    /**
     * Gets the groups the player are in
     *
     * @return all groups the player are in
     */
    List<IGroup> getGroups();

    /**
     * Adds the player to a group
     *
     * @param group the group to add
     */
    void addGroup(IGroup group);

    /**
     * Removes the player from a group
     *
     * @param group the group to remove
     */
    void removeGroup(IGroup group);

    /**
     * Gets the player's permissions
     *
     * @return all permissions the player holds
     */
    List<PermissionAttachment> getPermissions();

    /**
     * Assign a permission node to the player
     *
     * @param node the permission node
     */
    void addPermission(String node);

    /**
     * Remove assigned permission node from the player
     *
     * @param node the permission node
     */
    void removePermission(String node);

    /**
     * Checks if the player is vanished
     *
     * @return the current status of vanish
     */
    boolean isVanished();

    /**
     * Vanishes the player
     *
     * @param vanished the vanish status
     */
    void setVanished(boolean vanished);

    /**
     * Gets the username of the player
     *
     * @return the player's username
     */
    String getName();

    /**
     * Gets the unique identifier of the player
     *
     * @return the player's unique identifier
     */
    UUID getUUID();
}
