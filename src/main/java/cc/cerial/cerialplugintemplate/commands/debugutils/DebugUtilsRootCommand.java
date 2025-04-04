package cc.cerial.cerialplugintemplate.commands.debugutils;

import cc.cerial.cerialplugintemplate.CerialPluginTemplate;
import cc.cerial.cerialplugintemplate.interfaces.PluginCommand;
import cc.cerial.cerialplugintemplate.interfaces.RootCommand;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;

@SuppressWarnings("UnstableApiUsage")
@RootCommand
public class DebugUtilsRootCommand implements PluginCommand {
    @Override
    public LiteralCommandNode<CommandSourceStack> getCommand() {
        return Commands.literal("debugutils")
                .requires(CerialPluginTemplate.getUtils().getPermCheck("*"))
                .build();
    }
}
