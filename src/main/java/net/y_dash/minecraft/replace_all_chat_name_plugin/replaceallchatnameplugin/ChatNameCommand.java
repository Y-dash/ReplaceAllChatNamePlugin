package net.y_dash.minecraft.replace_all_chat_name_plugin.replaceallchatnameplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * 表示名設定コマンドクラス
 */
public class ChatNameCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player displayingPlayer = Bukkit.getServer().getPlayer(args[0]);

        if(displayingPlayer == null) {
            sender.sendMessage(args[0] + "が存在しません");
            return false;
        }

        ReplaceAllChatNamePlugin.Setting.displayingPlayer = displayingPlayer;
        return true;
    }
}
