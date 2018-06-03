package ores;

public class Scordite extends Ore {

	public Scordite() {
		// TODO Auto-generated constructor stub
	}

	public Scordite(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Scordite";
		goodName = "Condensed " + name;
		superiorName = "Massive " + name;
		eliteName = "Glossy " + name;
		volume = 0.15;
	}

}
