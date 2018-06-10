package ships;

public class Venture extends Ship {
	
	public Venture() {
		// ship name
		this.name = "Venture";
		
		// fitting attributes
		this.highSlots = 3;
		this.turrets = 2;
		this.midSlots = 3;
		this.lowSlots = 2;

		// drone attributes (if applicable)
		this.droneBay = 10;
		this.droneBandwidth = 10;
		this.cargoBay = 50;
		this.oreBay = 5000;

		// targeting attributes
		this.targetRange = 15;
		this.sigRadius = 40;

		// velocity attributes
		this.maxVelocity = 335;

		// Bonuses and duration reductions
		this.roleYieldBonus = 1;
		this.shipYieldBonus = 0.05;
		this.shipReduceDuration = 0.05;
		this.advShipReduceDuration = 0;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0;
		this.cargoBonus = 0;
	}
	
}
