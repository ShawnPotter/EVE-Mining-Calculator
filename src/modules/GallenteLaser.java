package modules;

public class GallenteLaser extends MiningMod {

	public GallenteLaser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GallenteLaser(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "Gallente Mining Laser";
		techLevel = 1;
		metaLevel = 8;
		cpu = 60;
		powergrid = 3;
		yield = 45;
		range = 10;
	}

}
