package ores;

public class Pyroxeres extends Ore {

	public Pyroxeres() {
		// TODO Auto-generated constructor stub
	}

	public Pyroxeres(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Pyroxeres";
		goodName = "Solid " + name;
		superiorName = "Vicious " + name;
		eliteName = "Opulent " + name;
		volume = 0.3;
	}

}
