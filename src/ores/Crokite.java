package ores;

public class Crokite extends Ore {

	public Crokite() {
		// TODO Auto-generated constructor stub
	}

	public Crokite(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Crokite";
		goodName = "Sharp " + name;
		superiorName = "Crystalline " + name;
		eliteName = "Pellucid " + name;
		volume = 16;
	}

}
