/** 
 * @author Shawn Potter
 */

package modules;

public class SingleDiode extends MiningMod {

	public SingleDiode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SingleDiode(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield,
			double range) {
		super(modName, techLevel, metaLevel, cpu, powergrid, yield, range);
		// attributes
		modName = "Single Diode Basic Mining Laser";
		techLevel = 1;
		metaLevel = 6;
		cpu = 45;
		powergrid = 2;
		yield = 25;
		range = 11;
	}

}
