package ships;

public class Retriever extends Ship {
	public Retriever() {
		// ship name
		this.name = "Retriever";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 1;
		this.lowSlots = 3;
		this.cargoBay = 450;
		this.oreBay = 22000;
		// drone attributes (if applicable)
		this.droneBay = 25;
		this.droneBandwidth = 25;
		// targeting attributes
		this.targetRange = 30;
		this.sigRadius = 250;
		// velocity attributes
		this.maxVelocity = 80;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0;
		this.cargoBonus = 0.05;
	}
}
