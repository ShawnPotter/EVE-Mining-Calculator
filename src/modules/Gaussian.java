package modules;

public class Gaussian extends MiningMod {

	public Gaussian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gaussian(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "EP-S Gaussian Scoped Mining Laser";
		techLevel = 1;
		metaLevel = 1;
		cpu = 65;
		powergrid = 3;
		yield = 50;
		range = 16;
	}
	
}
