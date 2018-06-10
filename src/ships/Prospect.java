package ships;

public class Prospect extends Ship {
	
	public Prospect() {
		// TODO Auto-generated constructor stub
		this.name = "Prospect";
		// fitting attributes
		this.highSlots = 3;
		this.midSlots = 3;
		this.lowSlots = 4;

		// drone attributes (if applicable)
		this.droneBay = 0;
		this.droneBandwidth = 0;

		// Cargo attributes
		this.cargoBay = 150;
		this.oreBay = 10000;

		// targeting attributes
		this.targetRange = 20;
		this.sigRadius = 40;

		// velocity attributes
		this.maxVelocity = 380;

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
