package ships;

public class Mackinaw extends Ship {
	public Mackinaw() {
		// ship name
		this.name = "Mackinaw";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 4;
		this.lowSlots = 3;
		this.cargoBay = 450;
		this.oreBay = 28000;
		// drone attributes (if applicable)
		this.droneBay = 50;
		this.droneBandwidth = 50;
		// targeting attributes
		this.targetRange = 30;
		this.sigRadius = 250;
		// velocity attributes
		this.maxVelocity = 90;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0.02;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0;
		this.cargoBonus = 0.05;

	}
}
