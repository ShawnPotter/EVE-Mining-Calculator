package ores;

public class DarkOchre extends Ore {

	public DarkOchre() {
		// TODO Auto-generated constructor stub
	}

	public DarkOchre(String name, String goodName, String superiorName, String eliteName, double volume) {
		super(name, goodName, superiorName, eliteName, volume);
		name = "Dark Ochre";
		goodName = "Onyx Ochre";
		superiorName = "Obsidian Ochre";
		eliteName = "Jet Ochre";
		volume = 8;
	}

}
