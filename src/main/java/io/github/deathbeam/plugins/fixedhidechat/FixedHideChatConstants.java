package io.github.deathbeam.plugins.fixedhidechat;

import com.google.common.collect.ImmutableSet;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

import net.runelite.api.widgets.*;

public class FixedHideChatConstants
{
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_OPTION,
		1
	);

	// Wrong PIN popup, idk what else; S162.565 (ID: 10617397)
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_SPECIAL = new AbstractMap.SimpleEntry<>(
		InterfaceID.CHATBOX,
		565
	);

	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_SPRITE = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_SPRITE,
		2
	);

	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_NPC = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_NPC,
		2
	);

	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_PLAYER = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_PLAYER,
		0
	);

	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_CONTAINER = new AbstractMap.SimpleEntry<>(
		ComponentID.CHATBOX_CONTAINER,
		0
	);

	private static final Map.Entry<Integer, Integer>  FIXED_VIEWPORT_BANK_POPUP_CONTAINER = new AbstractMap.SimpleEntry<>(
		ComponentID.BANK_CONTAINER,
		0
	);

	private static final Map.Entry<Integer, Integer>  FIXED_VIEWPORT_SEED_VAULT_INVENTORY_ITEM_CONTAINER = new AbstractMap.SimpleEntry<>(
		ComponentID.SEED_VAULT_INVENTORY_ITEM_CONTAINER,
		0
	);

	static final Map.Entry<Integer, Integer>  FIXED_MAIN = new AbstractMap.SimpleEntry<>(
		InterfaceID.FIXED_VIEWPORT,
		9
	);

	// Cannot find a suitable constant for 270, this is for "Making" interfaces (glassblowing, potion making, smelting)
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_MAKE_X = new AbstractMap.SimpleEntry<>(
		270,
		1
	);

	static final int DEFAULT_VIEW_HEIGHT = 334;
	static final int EXPANDED_VIEW_HEIGHT = 476;
	static final int BANK_X = 12;
	static final int BANK_Y = 2;
	// This is the VIEW_HEIGHT minus the BANK_Y minus 1 since there is a gap of 1 pixel at the bottom without the plugin.
	static final int DEFAULT_VIEW_WIDGET_HEIGHT = DEFAULT_VIEW_HEIGHT - BANK_Y - 1;
	static final int EXPANDED_VIEW_WIDGET_HEIGHT = EXPANDED_VIEW_HEIGHT - BANK_Y - 1;

	static final Set<Map.Entry<Integer, Integer>> AUTO_EXPAND_WIDGETS = ImmutableSet
		.<Map.Entry<Integer, Integer>>builder()
		.add(CHATBOX_MESSAGES_DIALOG)
		.add(CHATBOX_MESSAGES_SPECIAL)
		.add(CHATBOX_MESSAGES_CONTAINER)
		.add(CHATBOX_MESSAGES_DIALOG_NPC)
		.add(CHATBOX_MESSAGES_DIALOG_PLAYER)
		.add(CHATBOX_MESSAGES_DIALOG_SPRITE)
		.add(CHATBOX_MESSAGES_MAKE_X)
		.build();

	static final Set<Map.Entry<Integer, Integer>> TO_CONTRACT_WIDGETS = ImmutableSet
		.<Map.Entry<Integer, Integer>>builder()
		.add(FIXED_VIEWPORT_BANK_POPUP_CONTAINER)
		.add(FIXED_VIEWPORT_SEED_VAULT_INVENTORY_ITEM_CONTAINER)
		.build();
}
