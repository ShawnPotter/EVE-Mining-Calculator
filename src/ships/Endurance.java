package ships;

public class Endurance extends Ship {
	
	public Endurance() {
		// ship name
		this.name = "Endurance";
		
		// fitting attributes
		this.highSlots = 3;
		this.midSlots = 4;
		this.lowSlots = 3;

		// drone attributes (if applicable)
		this.droneBay = 30;
		this.droneBandwidth = 15;

		// Cargo attributes
		this.cargoBay = 200;
		this.oreBay = 15000;

		// targeting attributes
		this.targetRange = 20;
		this.sigRadius = 40;
		
		// velocity attributes
		this.maxVelocity = 420;

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
