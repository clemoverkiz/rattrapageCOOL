package com.zergwar.common;

public class Planet {

	private String name;
	private float coordX;
	private float coordY;
	private int diameter;
	private int ownerID = -1;
	private int armyCount;
	
	public Planet(String name, Float coordX, Float coordY, Integer diameter, int ownerID, int armyCount) {
		this.name = name;
		this.coordX = coordX;
		this.coordY = coordY;
		this.diameter = diameter;
		this.ownerID = ownerID;
		this.armyCount = armyCount;
	}

	/**
	 * Renvoie le nom de la plan�te
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * renvoie X de la planete
	 * @return
	 */
	public float getX() {
		return coordX;
	}
	
	/**
	 * renvoie Y de la planete
	 * @return
	 */
	public float getY() {
		return coordY;
	}
	
	/**
	 * Renvoie le diam�tre de la plan�te
	 * @return
	 */
	public int getDiameter() {
		return this.diameter;
	}
	
	/**
	 * Renvoie l'ID du propri�taire de la plan�te
	 * @return
	 */
	public int getOwnerID() {
		return this.ownerID;
	}

	/**
	 * Renvoie le nombre d'arm�es pr�sentes sur la plan�te
	 * @return
	 */
	public int getArmyCount() {
		return this.armyCount;
	}

	/**
	 * Renvoie si la plan�te est inoccup�e
	 * @return
	 */
	public boolean isEmpty() {
		return this.ownerID < 0;
	}

	/**
	 * D�finit le propri�taire de la partie
	 * @param playerId
	 */
	public void setOwner(int playerId) {
		this.ownerID = playerId;
	}

	/**
	 * D�finit le nombre d'arm�es sur une plan�te
	 * @param armies
	 */
	public void setArmyCount(int armies) {
		this.armyCount = armies;
	}
}
