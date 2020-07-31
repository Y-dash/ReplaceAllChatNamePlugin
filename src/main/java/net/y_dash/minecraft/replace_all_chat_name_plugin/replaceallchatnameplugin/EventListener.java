package net.y_dash.minecraft.replace_all_chat_name_plugin.replaceallchatnameplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerChatEvent(PlayerChatEvent event) {
        if(ReplaceAllChatNamePlugin.Setting.displayingPlayer == null) {
            return;
        }

        event.setPlayer(ReplaceAllChatNamePlugin.Setting.displayingPlayer);
    }
}
