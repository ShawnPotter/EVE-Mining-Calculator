package ships;

/**
 * 
 * Abstract template to set up all ships. All variables will be assigned to ships
 * but not all variables will be definitively used. 
 *  
 * @author Shawn Potter
 */

public abstract class Ship {
	protected String name;
	protected int highSlots;
	protected int turrets;
	protected int midSlots;
	protected int lowSlots;
	protected int droneBay;
	protected int droneBandwidth;
	protected double cargoBay;
	protected double oreBay;
	protected double targetRange;
	protected double sigRadius;
	protected double maxVelocity;
	protected double roleYieldBonus;
	protected double gasReduceDuration;
	protected double shipYieldBonus;
	protected double shipReduceDuration;
	protected double advShipYieldBonus;
	protected double advShipReduceDuration;
	protected double roleReduceDuration;
	protected double cargoBonus;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public double getRoleYieldBonus() {
		return roleYieldBonus;
	}

	public void setRoleYieldBonus(double roleYieldBonus) {
		this.roleYieldBonus = roleYieldBonus;
	}

	public double getGasReduceDuration() {
		return gasReduceDuration;
	}

	public void setGasReduceDuration(double gasReduceDuration) {
		this.gasReduceDuration = gasReduceDuration;
	}

	public double getShipYieldBonus() {
		return shipYieldBonus;
	}

	public void setShipYieldBonus(double shipYieldBonus) {
		this.shipYieldBonus = shipYieldBonus;
	}

	public double getShipReduceDuration() {
		return shipReduceDuration;
	}

	public void setShipReduceDuration(double shipReduceDuration) {
		this.shipReduceDuration = shipReduceDuration;
	}

	public double getAdvShipReduceDuration() {
		return advShipReduceDuration;
	}

	public void setAdvShipReduceDuration(double advShipReduceDuration) {
		this.advShipReduceDuration = advShipReduceDuration;
	}

	public double getRoleReduceDuration() {
		return roleReduceDuration;
	}

	public void setRoleReduceDuration(double roleReduceDuration) {
		this.roleReduceDuration = roleReduceDuration;
	}

	
	public double getAdvShipYieldBonus() {
		return advShipYieldBonus;
	}

	public void setAdvShipYieldBonus(double advShipYieldBonus) {
		this.advShipYieldBonus = advShipYieldBonus;
	}
	

	public int getTurrets() {
		return turrets;
	}

	public void setTurrets(int turrets) {
		this.turrets = turrets;
	}
	public double getCargoBonus() {
		return cargoBonus;
	}
	public void setCargoBonus(double cargoBonus) {
		this.cargoBonus = cargoBonus;
	}
	public void setShip() {
		
	}

	@Override
	public String toString() {
		return "Ship [highSlots=" + highSlots + ", midSlots=" + midSlots + ", lowSlots=" + lowSlots + ", droneBay="
				+ droneBay + ", droneBandwidth=" + droneBandwidth + ", cargoBay=" + cargoBay + ", oreBay=" + oreBay
				+ ", targetRange=" + targetRange + ", sigRadius=" + sigRadius + ", maxVelocity=" + maxVelocity
				+ ", roleYieldBonus=" + roleYieldBonus + ", gasReduceDuration=" + gasReduceDuration
				+ ", shipYieldBonus=" + shipYieldBonus + ", shipReduceDuration=" + shipReduceDuration
				+ ", advShipReduceDuration=" + advShipReduceDuration + ", roleReduceDuration=" + roleReduceDuration
				+ "]";
	}
	
	
	
}