package ships;

public class Procurer extends Ship {
	public Procurer() {
		// ship name
		this.name = "Procurer";
		// fitting attributes
		this.highSlots = 2;
			// Barges use Strip miners which only need high slots and not turret slots, turrets will be set to 2 for Barges 
		this.turrets = 2;  
		this.midSlots = 4;
		this.lowSlots = 2;
		this.cargoBay = 350;
		this.oreBay = 12000;
		// drone attributes (if applicable)
		this.droneBay = 50;
		this.droneBandwidth = 25;
		// targeting attributes
		this.targetRange = 30;
		this.sigRadius = 150;
		// velocity attributes
		this.maxVelocity = 160;
		// Bonuses and duration reductions
		this.roleYieldBonus = 0;
		this.shipYieldBonus = 0;
		this.shipReduceDuration = 0.02;
		this.advShipReduceDuration = 0;
		this.advShipYieldBonus = 0;
		this.roleReduceDuration = 0;
	}
}
