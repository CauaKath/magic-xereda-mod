package net.cauakath.magic_xereda;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicXereda implements ModInitializer {
		public static final String MOD_ID = "magic_xereda";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		int portalColor = 0x4812a6;

		CustomPortalBuilder.beginPortal()
						.frameBlock(Blocks.GRASS_BLOCK)
						.lightWithItem(Items.BEETROOT)
						.destDimID(new Identifier(MOD_ID, "xeredadim"))
						.tintColor(portalColor)
						.flatPortal()
						.registerPortal();
	}
}