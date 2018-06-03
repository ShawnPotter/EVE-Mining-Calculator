package ores;

public class Hedbergite extends Ore {

	public Hedbergite() {
		// TODO Auto-generated constructor stub
	}

	public Hedbergite(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Hedbergite";
		goodName = "Vitric " + name;
		superiorName = "Glazed " + name;
		eliteName = "Lustrous " + name;
		volume = 3;	
	}

}
