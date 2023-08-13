package net.mcreator.rjsnaruto.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.rjsnaruto.network.RjsNarutoModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class NqarutocmdpProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		String variable = "";
		double value = 0;
		Entity player = null;
		variable = StringArgumentType.getString(arguments, "variable");
		value = DoubleArgumentType.getDouble(arguments, "value");
		player = new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "player");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity();
		Entity splayer = player;
		if (("chakra").equals(variable)) {
			if ((splayer.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RjsNarutoModVariables.PlayerVariables())).maxchakra > value) {
				{
					double _setval = value;
					splayer.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chakra = _setval;
						capability.syncPlayerVariables(splayer);
					});
				}
			} else {
				{
					double _setval = (splayer.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new RjsNarutoModVariables.PlayerVariables())).maxchakra;
					splayer.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chakra = _setval;
						capability.syncPlayerVariables(splayer);
					});
				}
			}
		} else if (("maxchakra").equals(variable)) {
			{
				double _setval = value;
				splayer.getCapability(RjsNarutoModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.maxchakra = _setval;
					capability.syncPlayerVariables(splayer);
				});
			}
		}
	}
}
