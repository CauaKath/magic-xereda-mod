package net.cauakath.magic_xereda.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MagicXeredaWorldGenerator extends FabricDynamicRegistryProvider {
  public MagicXeredaWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registries) {
    super(output, registries);
  }
  @Override
  protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
    entries.addAll(registries.getWrapperOrThrow(RegistryKeys.DIMENSION_TYPE));
  }

  @Override
  public String getName() {
    return "Magic Xereda World Generator";
  }
}
