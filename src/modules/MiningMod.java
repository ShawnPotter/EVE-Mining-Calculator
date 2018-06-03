/**
 * 
 * Abstract class setting the basic template for modules for mining 
 * 
 * @author Shawn Potter
 */

package modules;

public abstract class MiningMod {
	private String modName;
	private int techLevel;
	private int metaLevel;
	private double cpu;
	private double powergrid;
	private double yield;
	private double range;
	
	// default constructor
	public MiningMod() {
		
	}
	
	// multi param constructor
	public MiningMod(String modName, int techLevel, int metaLevel, double cpu, double powergrid, double yield, double range) {
		super();
		this.modName = modName;
		this.techLevel = techLevel;
		this.metaLevel = metaLevel;
		this.cpu = cpu;
		this.powergrid = powergrid;
		this.yield = yield;
		this.range = range;
	}
	
	// getters and setters
	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public int getTechLevel() {
		return techLevel;
	}

	public void setTechLevel(int techLevel) {
		this.techLevel = techLevel;
	}

	public int getMetaLevel() {
		return metaLevel;
	}

	public void setMetaLevel(int metaLevel) {
		this.metaLevel = metaLevel;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getPowergrid() {
		return powergrid;
	}

	public void setPowergrid(double powergrid) {
		this.powergrid = powergrid;
	}

	public double getYield() {
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}
	
	// toString
	@Override
	public String toString() {
		return "MiningMod [getTechLevel()=" + getTechLevel() + ", getMetaLevel()=" + getMetaLevel() + ", getCpu()="
				+ getCpu() + ", getPowergrid()=" + getPowergrid() + ", getYield()=" + getYield() + ", getRange()="
				+ getRange() + "]";
	}
}
