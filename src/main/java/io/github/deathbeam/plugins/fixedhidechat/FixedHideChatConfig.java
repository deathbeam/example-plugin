package io.github.deathbeam.plugins.fixedhidechat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("fixedhidechat")
public interface FixedHideChatConfig extends Config
{
    @ConfigItem(
            position = 0,
            keyName = "resizeViewport",
            name = "Resize viewport",
            description = "Toggles viewport resizing on open/closed chat"
    )

    default boolean resizeViewport()
    {
        return false;
    }
}
