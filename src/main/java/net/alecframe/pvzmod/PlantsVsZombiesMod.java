package net.alecframe.pvzmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlantsVsZombiesMod implements ModInitializer {
	public static final String MOD_ID = "pvzmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

	}

	public static Identifier registerModIdentification(String name) {
		return Identifier.of(PlantsVsZombiesMod.MOD_ID, name);
	}
}