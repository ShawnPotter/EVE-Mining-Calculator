package ores;

public class Jaspet extends Ore {

	public Jaspet() {
		// TODO Auto-generated constructor stub
	}

	public Jaspet(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Jaspet";
		goodName = "Pure " + name;
		superiorName = "Pristine " + name;
		eliteName = "Immaculate " + name;
		volume = 2;
	}

}
