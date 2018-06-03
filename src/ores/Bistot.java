package ores;

public class Bistot extends Ore {

	public Bistot() {
		// TODO Auto-generated constructor stub
	}

	public Bistot(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Bistot";
		goodName = "Triclinic " + name;
		superiorName = "Monoclinic " + name;
		eliteName = "Cubic " + name;
		volume = 16;
	}

}
