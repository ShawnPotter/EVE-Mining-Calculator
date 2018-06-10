package ships;

public class Skiff extends Ship {
	public Skiff() {
		// ship name
		this.name = "Skiff";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 5;
		this.lowSlots = 3;
		this.cargoBay = 350;
		this.oreBay = 15000;
		// drone attributes (if applicable)
		this.droneBay = 100;
		this.droneBandwidth = 50;
		// targeting attributes
		this.targetRange = 30;
		this.sigRadius = 150;
		// velocity attributes
		this.maxVelocity = 200;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0.02;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0;
		this.cargoBonus = 0;

	}
}
