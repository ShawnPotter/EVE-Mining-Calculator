/** 
 * @author Shawn Potter
 */

package modules;

public class Miner1 extends Mod {

	public Miner1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Miner1(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield, double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "Miner I";
		techLevel = 1;
		metaLevel = 0;
		cpu = 60;
		powergrid = 2;
		yield = 40;
		range = 10;
	}
	
	
}
