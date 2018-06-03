/**
 * 
 * Abstract template to set up all ships. Some of these variables
 * aren't going to be used and some ships will need additional variables.
 *  
 * @author Shawn Potter
 */

package ships;

public abstract class Ship {
	private int highSlots;
	private int midSlots;
	private int lowSlots;
	private int droneBay;
	private int droneBandwidth;
	private double cargoBay;
	private double oreBay;
	private double targetRange;
	private double sigRadius;
	private double maxVelocity;
	
	
	//default constructor
	public Ship() {
		
	}
	
	//multi param constructor
	public Ship(int highSlots, int midSlots, int lowSlots, int droneBay, int droneBandwidth, double cargoBay,
			double oreBay, double targetRange, double sigRadius, double maxVelocity) {
		super();
		this.highSlots = highSlots;
		this.midSlots = midSlots;
		this.lowSlots = lowSlots;
		this.droneBay = droneBay;
		this.droneBandwidth = droneBandwidth;
		this.cargoBay = cargoBay;
		this.oreBay = oreBay;
		this.targetRange = targetRange;
		this.sigRadius = sigRadius;
		this.maxVelocity = maxVelocity;
	}
	
	//getters and setters
	public int getHighSlots() {
		return highSlots;
	}
	public void setHighSlots(int highSlots) {
		this.highSlots = highSlots;
	}
	public int getMidSlots() {
		return midSlots;
	}
	public void setMidSlots(int midSlots) {
		this.midSlots = midSlots;
	}
	public int getLowSlots() {
		return lowSlots;
	}
	public void setLowSlots(int lowSlots) {
		this.lowSlots = lowSlots;
	}
	public int getDroneBay() {
		return droneBay;
	}
	public void setDroneBay(int droneBay) {
		this.droneBay = droneBay;
	}
	public int getDroneBandwidth() {
		return droneBandwidth;
	}
	public void setDroneBandwidth(int droneBandwidth) {
		this.droneBandwidth = droneBandwidth;
	}
	public double getCargoBay() {
		return cargoBay;
	}
	public void setCargoBay(double cargoBay) {
		this.cargoBay = cargoBay;
	}
	public double getOreBay() {
		return oreBay;
	}
	public void setOreBay(double oreBay) {
		this.oreBay = oreBay;
	}
	public double getTargetRange() {
		return targetRange;
	}
	public void setTargetRange(double targetRange) {
		this.targetRange = targetRange;
	}
	public double getSigRadius() {
		return sigRadius;
	}
	public void setSigRadius(double sigRadius) {
		this.sigRadius = sigRadius;
	}
	public double getMaxVelocity() {
		return maxVelocity;
	}
	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	@Override
	public String toString() {
		return "Ship [getHighSlots()=" + getHighSlots() + ", getMidSlots()=" + getMidSlots() + ", getLowSlots()="
				+ getLowSlots() + ", getDroneBay()=" + getDroneBay() + ", getDroneBandwidth()=" + getDroneBandwidth()
				+ ", getCargoBay()=" + getCargoBay() + ", getTargetRange()=" + getTargetRange() + ", getSigRadius()="
				+ getSigRadius() + ", getMaxVelocity()=" + getMaxVelocity() + "]";
	}
	
	
	
}
