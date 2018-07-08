package ice;
/**
 * 
 * Abstract to set up the template for all Ice asteroids
 *  
 * @author Shawn Potter
 */
public abstract class Ice {
	//Ice Attributes
	protected String name;
	protected String enrichedName;
	protected boolean hasEnrichedVar; //var = varient
	protected double volume;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public String getEnrichedName() {
		return enrichedName;
	}
	public void setEnrichedName(String enrichedName) {
		this.enrichedName = enrichedName;
	}
	public boolean isHasEnrichedVar() {
		return hasEnrichedVar;
	}
	public void setHasEnrichedVar(boolean hasEnrichedVar) {
		this.hasEnrichedVar = hasEnrichedVar;
	}
	@Override
	public String toString() {
		return "Ice [name=" + name + ", enrichedName=" + enrichedName + ", hasEnrichedVar=" + hasEnrichedVar
				+ ", volume=" + volume + "]";
	}
	
		
}
