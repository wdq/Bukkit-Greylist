package com.quade.rhgreylist;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;


public class GreylistCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(commandLabel.equalsIgnoreCase("greylist")) {

            if(args.length == 1) {

                Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "pex user " + args[0] + " group set copper");
                sender.sendMessage(args[0] + " has been greylisted.");

            } else {

                sender.sendMessage("Incorrect syntax. Try /greylist username.");
            }

            return true;
        }
        return false;
    }
}
