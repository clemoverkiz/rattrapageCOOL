package com.zergwar.network.packets;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Packet4PlayerLeave extends Packet {

	public int playerID;
	
	public Packet4PlayerLeave(int id) {
		super();
		
		this.playerID = id;
		
		this.init();
	}
	
	/**
	 * Initialise le contenu
	 */
	public void init() {
		try {
			this.writeInt(this.playerID);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Renvoie l'ID de paquet
	 */
	@Override
	public int getPacketID() {
		return Packet.ID_PACKET4PLAYERLEAVE;
	}
	
	/**
	 * Construit une nouvelle instance
	 * @param data
	 * @return
	 */
	public static Packet fromRaw(byte[] data) {
		try
		{
			DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
			int playerID = dis.readInt();
			dis.close();
			
			return new Packet4PlayerLeave(
				playerID
			);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String toString() {
		return "[Packet4PlayerLeave ***\n-> PlayerID="+this.playerID
			  +"\n*** ]";
	}
}
