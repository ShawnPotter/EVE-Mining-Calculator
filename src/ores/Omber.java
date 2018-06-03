package ores;

public class Omber extends Ore {

	public Omber() {
		// TODO Auto-generated constructor stub
	}

	public Omber(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Omber";
		goodName = "Silvery " + name;
		superiorName = "Golden " + name;
		eliteName = "Platinoid " + name;
		volume = 0.6;
	}

}
