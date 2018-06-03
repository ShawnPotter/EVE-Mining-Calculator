package ores;

public class Hemorphite extends Ore {

	public Hemorphite() {
		// TODO Auto-generated constructor stub
	}

	public Hemorphite(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Hemorphite";
		goodName = "Vivid " + name;
		superiorName = "Radiant " + name;
		eliteName = "Scintillating " + name;
		volume = 3;
	}

}
