package ores;

public abstract class Ore {
	// Ore Attributes
	private String name;
	private String goodName; // Ore name for +5% Variant
	private String superiorName; //Ore name for +10% Variant
	private String eliteName; // Ore name for +15 Variant (moon mining)
	private double volume;
	public Ore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ore(String name, String goodName, String superiorName, String eliteName, double volume) {
		super();
		this.name = name;
		this.goodName = goodName;
		this.superiorName = superiorName;
		this.eliteName = eliteName;
		this.volume = volume;
	}
	
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
