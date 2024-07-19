package net.cauakath.magic_xereda;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicXereda implements ModInitializer {
		public static final String MOD_ID = "magic_xereda";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello World");
	}
}