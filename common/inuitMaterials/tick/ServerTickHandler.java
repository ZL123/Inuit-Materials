package inuitMaterials.tick;

import inuitMaterials.lib.Reference;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {
	
	public static EntityPlayer hitByUkkungawok;
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.PLAYER))) {
			onPlayerTick((EntityPlayer) tickData[0]);
		}
		if (hitByUkkungawok != null) {
			ukkungawokEffects(hitByUkkungawok);
			hitByUkkungawok = null;
		}
	}
	
	private void onPlayerTick(EntityPlayer player) {
		
	}
	
	public void ukkungawokEffects(EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(Potion.weakness.id, 100, 1));
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		return Reference.MOD_ID + ": " + getClass().getSimpleName();
	}

}
