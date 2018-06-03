package modules;

public class Miner2 extends MiningMod {

	public Miner2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Miner2(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "Miner II";
		techLevel = 2;
		metaLevel = 5;
		cpu = 80;
		powergrid = 4;
		yield = 60;
		range = 12;
	}

}
