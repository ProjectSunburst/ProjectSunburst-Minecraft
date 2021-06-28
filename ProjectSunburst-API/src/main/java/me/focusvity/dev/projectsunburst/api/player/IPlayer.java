package me.focusvity.dev.projectsunburst.api.player;

import me.focusvity.dev.projectsunburst.api.ban.IBan;

import java.util.List;
import java.util.UUID;

public interface IPlayer
{

    /**
     * A check to see if the player is console
     *
     * @return a boolean if the player is console
     */
    boolean isConsole();

    /**
     * Sends a message to the player
     *
     * @param message a message to send to the player
     */
    void message(String message);

    /**
     * A check to see if the player is banned
     *
     * @return a boolean if the player is banned
     */
    boolean isBanned();

    /**
     * Gets the player's current ban if available
     *
     * @return the player's current ban if available otherwise null
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
     */
    IBan getBan(String banId);

    /**
     * A check to see if the player is muted
     *
     * @return a boolean if the player is muted
     */
    boolean isMuted();

    /**
     * Returns a string of the player's username
     *
     * @return the player's username
     */
    String getName();

    /**
     * Returns a UUID of the player's unique identifier
     *
     * @return the player's unique identifier
     */
    UUID getUUID();
}
