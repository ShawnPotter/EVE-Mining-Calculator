package ores;

public class Spodumain extends Ore {

	public Spodumain() {
		// TODO Auto-generated constructor stub
	}

	public Spodumain(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Spodumain";
		goodName = "Bright " + name;
		superiorName = "Gleaming " + name;
		eliteName = "Dazzling " + name;
		volume = 16;
	}

}
