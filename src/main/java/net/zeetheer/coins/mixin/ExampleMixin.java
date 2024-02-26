package net.zeetheer.coins.mixin;

import net.minecraft.server.MinecraftServer;
import net.zeetheer.coins.Coins;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		Coins.LOGGER.info("This code is injected into the start of MinecraftServer.loadWorld()V");
	}
}