package io.github.deathbeam.plugins.fixedhidechat;

import com.google.common.collect.ImmutableSet;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

import net.runelite.api.widgets.*;

public class FixedHideChatConstants
{
	/**
	 * Creates an entry for a widget of the chatbox interface from its packed gameval id
	 * ({@code interface << 16 | child}). Using the gameval constants instead of hardcoded child
	 * indices keeps the entries valid when the game adds or reorders chatbox children.
	 */
	private static Map.Entry<Integer, Integer> chatboxWidget(final int packedWidgetId)
	{
		return new AbstractMap.SimpleEntry<>(packedWidgetId >>> 16, packedWidgetId & 0xFFFF);
	}

	// 'Rub' option (S219.0) Duel rings, Slayer Rings, Burning Amulets, etc.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_OPTION = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_OPTION,
		0
	);

	// Player dialog (S217.0) - when your player character speaks in a dialog
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_PLAYER = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_PLAYER,
		0
	);

	// Sprite dialog (S193.0) - "Are you sure you want to drop..." valuable item warnings, etc.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_SPRITE = new AbstractMap.SimpleEntry<>(
		InterfaceID.DIALOG_SPRITE,
		0
	);

	// Skill multi-choice dialog (S270.0) - "How many would you like to..." (cutting gems, burning logs, etc.)
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_SKILLMULTI = new AbstractMap.SimpleEntry<>(
		net.runelite.api.gameval.InterfaceID.SKILLMULTI,
		0
	);

	// Message box dialog (S229.0) - Missing chatbox popup of some NPC's when there's only a "Click here to continue" option.
	// This should also fix the missing chatbox popup when buying battlestaves in Varrock (not sure since I tested in F2P).
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_MESSAGEBOX = new AbstractMap.SimpleEntry<>(
		net.runelite.api.gameval.InterfaceID.MESSAGEBOX,
		0
	);

	// Membership benefits prompt (S284.0) - "Become a Member" chatbox popup.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_MEMBERSHIP_PROMPT = new AbstractMap.SimpleEntry<>(
		net.runelite.api.gameval.InterfaceID.MEMBERSHIP_BENEFITS_PROMPT,
		0
	);

	// Destroy item confirmation (S584.0) - "Are you sure you want to destroy this item?" Yes/No screen.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_DIALOG_CONFIRM_DESTROY = new AbstractMap.SimpleEntry<>(
		net.runelite.api.gameval.InterfaceID.CONFIRMDESTROY,
		0
	);

	// A lot of other stuff, we recurse through this, it should catch any messages under (S162.567 ID: 10617399)
	// Wrong PIN popup, NPC Dialog (N231.0 ID: 5138816), Make-X (N270.0 ID: 17694720)... etc.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_SPECIAL = chatboxWidget(
		net.runelite.api.gameval.InterfaceID.Chatbox.CHATOVERLAY
	);

	// Close icon of the interface that is opened inside the chatbox (S162.42).
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_CONTAINER = chatboxWidget(
		net.runelite.api.gameval.InterfaceID.Chatbox.CLOSE_ICON
	);

	// Title of the interface that is opened inside the chatbox (S162.43),
	// e.g. "What would you like to buy?" on the GE search box.
	private static final Map.Entry<Integer, Integer>  CHATBOX_MESSAGES_TITLE = chatboxWidget(
		net.runelite.api.gameval.InterfaceID.Chatbox.MES_TEXT
	);

	// Sub text of the interface that is opened inside the chatbox (S162.44),
	// e.g. "Start typing the name of an item to search for it".
	private static final Map.Entry<Integer, Integer>  CHATBOX_GE_SEARCH = chatboxWidget(
		net.runelite.api.gameval.InterfaceID.Chatbox.MES_TEXT2
	);

	// Scroll area of the interface that is opened inside the chatbox (S162.49).
	private static final Map.Entry<Integer, Integer>  CHATBOX_MES_LAYER_SCROLLAREA = chatboxWidget(
		net.runelite.api.gameval.InterfaceID.Chatbox.MES_LAYER_SCROLLAREA
	);

	private static final Map.Entry<Integer, Integer>  FIXED_VIEWPORT_BANK_POPUP_CONTAINER = new AbstractMap.SimpleEntry<>(
		ComponentID.BANK_CONTAINER,
		0
	);

	private static final Map.Entry<Integer, Integer>  FIXED_VIEWPORT_SEED_VAULT_INVENTORY_ITEM_CONTAINER = new AbstractMap.SimpleEntry<>(
		InterfaceID.SEED_VAULT,
		1
	);

	private static final Map.Entry<Integer, Integer> CHAT_LEFT = new AbstractMap.SimpleEntry<>(
		net.runelite.api.gameval.InterfaceID.CHAT_LEFT,
		0
	);

	static final Map.Entry<Integer, Integer>  FIXED_MAIN = new AbstractMap.SimpleEntry<>(
		InterfaceID.FIXED_VIEWPORT,
		9
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
		.add(CHATBOX_MESSAGES_DIALOG_OPTION)
		.add(CHATBOX_MESSAGES_DIALOG_PLAYER)
		.add(CHATBOX_MESSAGES_DIALOG_SPRITE)
		.add(CHATBOX_MESSAGES_DIALOG_MESSAGEBOX)
		.add(CHATBOX_MESSAGES_DIALOG_CONFIRM_DESTROY)
		.add(CHATBOX_MESSAGES_MEMBERSHIP_PROMPT)
		.add(CHATBOX_MESSAGES_SKILLMULTI)
		.add(CHATBOX_MESSAGES_CONTAINER)
		.add(CHATBOX_MESSAGES_TITLE)
		.add(CHATBOX_MESSAGES_SPECIAL)
		.add(CHATBOX_GE_SEARCH)
		.add(CHAT_LEFT)
		.add(CHATBOX_MES_LAYER_SCROLLAREA)
		.build();

	static final Set<Map.Entry<Integer, Integer>> TO_CONTRACT_WIDGETS = ImmutableSet
		.<Map.Entry<Integer, Integer>>builder()
		.add(FIXED_VIEWPORT_BANK_POPUP_CONTAINER)
		.add(FIXED_VIEWPORT_SEED_VAULT_INVENTORY_ITEM_CONTAINER)
		.build();
}
