package modules;

public class ParticleBore extends MiningMod {

	public ParticleBore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParticleBore(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "Particle Bore Compact Mining Laser";
		techLevel = 1;
		metaLevel = 1;
		cpu = 55;
		powergrid = 2;
		yield = 50;
		range = 11;
	}

}
