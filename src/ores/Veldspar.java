package ores;

public class Veldspar extends Ore {

	public Veldspar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veldspar(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		// TODO Auto-generated constructor stub
		name = "Veldspar";
		goodName = "Concentrated " + name;
		superiorName = "Dense " + name;
		eliteName = "Stable " + name;
		volume = 0.1;
	}
	
}
