package ores;

public class Arkonor extends Ore {

	public Arkonor() {
		// TODO Auto-generated constructor stub
	}

	public Arkonor(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Arkonor";
		goodName = "Crimson " + name;
		superiorName = "Prime " + name;
		eliteName = "Flawless " + name;
		volume = 16;
	}

}
