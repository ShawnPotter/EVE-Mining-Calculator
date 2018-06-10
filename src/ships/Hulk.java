package ships;

public class Hulk extends Ship {
	public Hulk() {
		// ship name
		this.name = "Hulk";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 4;
		this.lowSlots = 3;
		this.cargoBay = 350;
		this.oreBay = 8500;
		// drone attributes (if applicable)
		this.droneBay = 50;
		this.droneBandwidth = 50;
		// targeting attributes
		this.targetRange = 35;
		this.sigRadius = 200;
		// velocity attributes
		this.maxVelocity = 140;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0.03;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0.25;
		this.cargoBonus = 0;

	}
}
