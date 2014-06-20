/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minetweaker.mc172.player;

import minetweaker.mc172.data.NBTConverter;
import minetweaker.minecraft.data.IData;
import minetweaker.minecraft.player.IPlayer;
import net.minecraft.entity.player.EntityPlayer;

/**
 *
 * @author Stan
 */
public class TweakerPlayer implements IPlayer {
	private final EntityPlayer player;
	
	public TweakerPlayer(EntityPlayer player) {
		this.player = player;
	}

	@Override
	public String getName() {
		return player.getCommandSenderName();
	}

	@Override
	public IData getData() {
		return NBTConverter.from(player.getEntityData(), true);
	}
	
	@Override
	public void update(IData data) {
		NBTConverter.updateMap(player.getEntityData(), data);
	}
}