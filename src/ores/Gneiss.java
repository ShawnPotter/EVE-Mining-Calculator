package ores;

public class Gneiss extends Ore {

	public Gneiss() {
		// TODO Auto-generated constructor stub
	}

	public Gneiss(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Gneiss";
		goodName = "Iridescent " + name;
		superiorName = "Prismatic " + name;
		eliteName = "Brilliant " + name;
		volume = 5;
	}

}
