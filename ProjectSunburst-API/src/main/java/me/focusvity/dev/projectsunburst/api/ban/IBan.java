package me.focusvity.dev.projectsunburst.api.ban;

import java.util.Date;
import java.util.UUID;

public interface IBan
{

    /**
     * Gets the ban identifier
     *
     * @return the identifier of the ban
     */
    String getId();

    /**
     * Gets the ban reason
     *
     * @return the reason of the ban
     */
    String getReason();

    /**
     * Gets the person who actioned the ban
     *
     * @return the unique identifier of the person
     */
    UUID getWho();

    /**
     * Gets the ban date
     *
     * @return the date of the ban
     */
     Date getDate();

    /**
     * Gets the ban expiry date
     *
     * @return the expiry date of the ban
     */
    Date getExpiryDate();

    /**
     * Gets the ban type
     *
     * @return the type of the ban
     * @see BanType
     */
    BanType getType();
}
