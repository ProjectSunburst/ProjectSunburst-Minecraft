package me.focusvity.dev.projectsunburst.core.player;

import me.focusvity.dev.projectsunburst.api.ban.IBan;
import me.focusvity.dev.projectsunburst.api.permission.IGroup;
import me.focusvity.dev.projectsunburst.api.player.IPlayer;
import org.bukkit.permissions.PermissionAttachment;

import java.util.List;
import java.util.UUID;

public class SPlayer implements IPlayer
{

    @Override
    public void message(String message)
    {
        //
    }

    @Override
    public boolean isBanned()
    {
        return false;
    }

    @Override
    public IBan getCurrentBan()
    {
        return null;
    }

    @Override
    public List<IBan> getBans()
    {
        return null;
    }

    @Override
    public IBan getBan(String banId)
    {
        return null;
    }

    @Override
    public boolean isMuted()
    {
        return false;
    }

    @Override
    public IGroup getPrimaryGroup()
    {
        return null;
    }

    @Override
    public void setPrimaryGroup(IGroup group)
    {
        //
    }

    @Override
    public List<IGroup> getGroups()
    {
        return null;
    }

    @Override
    public void addGroup(IGroup group)
    {
        //
    }

    @Override
    public void removeGroup(IGroup group)
    {
        //
    }

    @Override
    public List<PermissionAttachment> getPermissions()
    {
        return null;
    }

    @Override
    public void addPermission(String node)
    {
        //
    }

    @Override
    public void removePermission(String node)
    {
        //
    }

    @Override
    public boolean isVanished()
    {
        return false;
    }

    @Override
    public void setVanished(boolean vanished)
    {
        //
    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public UUID getUUID()
    {
        return null;
    }
}
