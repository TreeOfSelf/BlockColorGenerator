package me.sebastian420;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockColorGenerator implements ModInitializer {
	public static final String MOD_ID = "block-color-generator";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ServerWorldEvents.LOAD.register(this::loadWorld);
	}

	private void loadWorld(MinecraftServer minecraftServer, ServerWorld serverWorld) {
		if (serverWorld.getDimensionEntry().getKey().get() == DimensionTypes.OVERWORLD) {
			ColorDumper.dumpBlockColors(serverWorld);
		}
	}
}