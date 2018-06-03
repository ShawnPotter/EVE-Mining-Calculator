package ores;

public class Plagioclase extends Ore {

	public Plagioclase() {
		// TODO Auto-generated constructor stub
	}

	public Plagioclase(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Plagioclase";
		goodName = "Azure " + name;
		superiorName = "Rich " + name;
		eliteName = "Sparkling " + name;
		volume = 0.35;
	}

}
