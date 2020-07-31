package net.y_dash.minecraft.replace_all_chat_name_plugin.replaceallchatnameplugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReplaceAllChatNamePlugin extends JavaPlugin {

    public static class Setting {
        public static Player displayingPlayer = null;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        this.getCommand("cnset").setExecutor(new ChatNameCommand());
        this.getCommand("cnclear").setExecutor(new ClearCommand());
    }
}
