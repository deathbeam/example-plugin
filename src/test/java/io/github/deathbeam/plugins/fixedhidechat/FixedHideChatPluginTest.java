package io.github.deathbeam.plugins.fixedhidechat;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FixedHideChatPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FixedHideChatPlugin.class);
		RuneLite.main(args);
	}
}