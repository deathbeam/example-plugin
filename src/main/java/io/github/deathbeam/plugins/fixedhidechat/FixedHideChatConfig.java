package io.github.deathbeam.plugins.fixedhidechat;

import net.runelite.client.config.*;
import java.awt.event.*;

@ConfigGroup("FixedHideChat")
public interface FixedHideChatConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "resizeViewport",
			name = "Resize viewport",
			description = "Resize viewport when opening/closing chat"
	)
	default boolean resizeViewport()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hideChatHotkey",
			name = "Hotkey",
			description = "Hotkey used to hide the chat.<br>"
					+ "Can be a combination of keys (e.g. ctrl+L). Set the key to 'Not set' to disable this setting.",
			position = 1
	)
	default Keybind hideChatHotkey() {
		return new Keybind(KeyEvent.VK_ESCAPE, 0);
	}
}
