
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lolo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.lolo.item.KackeschwertItem;
import net.mcreator.lolo.LoloMod;

public class LoloModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LoloMod.MODID);
	public static final RegistryObject<Item> KACKESCHWERT = REGISTRY.register("kackeschwert", () -> new KackeschwertItem());
}
