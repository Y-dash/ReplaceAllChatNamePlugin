package net.y_dash.minecraft.replace_all_chat_name_plugin.replaceallchatnameplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ReplaceAllChatNamePlugin.Setting.displayingPlayer = null;
        return true;
    }
}
