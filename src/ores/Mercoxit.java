package ores;

public class Mercoxit extends Ore {

	public Mercoxit() {
		// TODO Auto-generated constructor stub
	}

	public Mercoxit(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Mercoxit";
		goodName = "Magma " + name;
		superiorName = "Vitreous " + name;
		eliteName = ""; // does not exist
		volume = 40;
	}

}
