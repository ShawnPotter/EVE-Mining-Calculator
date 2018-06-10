package ships;

public class Covetor extends Ship {
	public Covetor() {
		// ship name
		this.name = "Covetor";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 1;
		this.lowSlots = 3;
		this.cargoBay = 350;
		this.oreBay = 7000;
		// drone attributes (if applicable)
		this.droneBay = 50;
		this.droneBandwidth = 50;
		// targeting attributes
		this.targetRange = 35;
		this.sigRadius = 200;
		// velocity attributes
		this.maxVelocity = 100;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0.25;
		this.cargoBonus = 0;
	}
}
