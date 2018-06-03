package ships;

public class Venture extends Ship {
	// ship bonuses
	private double frigateYieldBonus; // bonus to mining yield per skill level
	private double gasHarvDurBonus; // reduction in Gas Cloud Harvesting Duration
	
	//role bonuses
	private double roleYieldBonus; // Independent role bonus based on the ships's role class
	
	
	public Venture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venture(int highSlots, int midSlots, int lowSlots, int droneBay, int droneBandwidth, double cargoBay,
			double oreBay, double targetRange, double sigRadius, double maxVelocity) {
		super(highSlots, midSlots, lowSlots, droneBay, droneBandwidth, cargoBay, oreBay, targetRange, sigRadius, maxVelocity);
		// fitting attributes
		highSlots = 3;
		midSlots = 3;
		lowSlots = 2;
		
		// drone attributes (if applicable)
		droneBay = 10;
		droneBandwidth = 10;
		cargoBay = 50;
		oreBay = 5000;
		
		// targeting attributes
		targetRange = 15;
		sigRadius = 40;
		
		// velocity attributes
		maxVelocity = 335;
		
		// Mining Frigate skill bonuses
		frigateYieldBonus = 1.05;
		gasHarvDurBonus = 1.05;
		
		// Venture's Role Bonuses
		roleYieldBonus = 2;
	}

	public double getFrigateYieldBonus() {
		return frigateYieldBonus;
	}

	public void setFrigateYieldBonus(double frigateYieldBonus) {
		this.frigateYieldBonus = frigateYieldBonus;
	}

	public double getGasHarvDurBonus() {
		return gasHarvDurBonus;
	}

	public void setGasHarvDurBonus(double gasHarvDurBonus) {
		this.gasHarvDurBonus = gasHarvDurBonus;
	}

	public double getRoleYieldBonus() {
		return roleYieldBonus;
	}

	public void setRoleYieldBonus(double roleYieldBonus) {
		this.roleYieldBonus = roleYieldBonus;
	}

	
}
