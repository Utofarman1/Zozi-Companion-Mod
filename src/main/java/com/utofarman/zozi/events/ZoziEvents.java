package com.utofarman.zozi.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.player.Player;
import com.utofarman.zozi.ZoziMod;
import com.utofarman.zozi.ZoziEntities;
import com.utofarman.zozi.entity.ZoziEntity;

@Mod.EventBusSubscriber(modid = ZoziMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ZoziEvents {

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        if (!player.level().isClientSide) {
            // Spawn Zozi companion
            ZoziEntity zozi = new ZoziEntity(ZoziEntities.ZOZI.get(), player.level());
            zozi.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), player.getXRot());
            zozi.setOwner(player);
            player.level().addFreshEntity(zozi);
        }
    }
}
