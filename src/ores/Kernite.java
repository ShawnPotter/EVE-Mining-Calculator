package ores;

public class Kernite extends Ore {

	public Kernite() {
		// TODO Auto-generated constructor stub
	}

	public Kernite(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Kernite";
		goodName = "Luminous " + name;
		superiorName = "Fiery " + name;
		eliteName = "Resplendant " + name;
		volume = 1.2;
	}

}
