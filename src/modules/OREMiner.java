/** 
 * @author Shawn Potter
 */

package modules;

public class OREMiner extends MiningMod {
	// default constructor
	public OREMiner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// multi param constructor
	public OREMiner(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "ORE Miner";
		techLevel = 1;
		metaLevel = 8;
		cpu = 80;
		powergrid = 4;
		yield = 65;
		range = 16;
	}

}
