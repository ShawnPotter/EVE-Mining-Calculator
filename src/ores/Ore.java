package ores;

/**
 * 
 * Abstract to set up the template for all Ores
 *  
 * @author Shawn Potter
 */

public abstract class Ore {
	// Ore Attributes
	protected String name;
	protected String goodName; // Ore name for +5% Variant
	protected String superiorName; //Ore name for +10% Variant
	protected String eliteName; // Ore name for +15 Variant (moon mining)
	protected double volume;
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getSuperiorName() {
		return superiorName;
	}
	public void setSuperiorName(String superiorName) {
		this.superiorName = superiorName;
	}
	public String getEliteName() {
		return eliteName;
	}
	public void setEliteName(String eliteName) {
		this.eliteName = eliteName;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	// toString
	@Override
	public String toString() {
		return "Ore [name=" + name + ", goodName=" + goodName + ", superiorName=" + superiorName + ", eliteName="
				+ eliteName + ", volume=" + volume + "]";
	}
	
	
	
	
	
}
