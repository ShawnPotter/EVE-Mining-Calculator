package ships;

public class Prospect extends Ship {
	private double frigateYieldBonus;
	private double gasHarvDurBonus;
	private double expeditionYieldBonus;
	private double roleYieldBonus;
	
	

	public Prospect() {
		// TODO Auto-generated constructor stub
	}

	public Prospect(int highSlots, int midSlots, int lowSlots, int droneBay, int droneBandwidth, double cargoBay,
			double oreBay, double targetRange, double sigRadius, double maxVelocity) {
		super(highSlots, midSlots, lowSlots, droneBay, droneBandwidth, cargoBay, oreBay, targetRange, sigRadius,
				maxVelocity);
		// fitting attributes
				highSlots = 3;
				midSlots = 3;
				lowSlots = 4;
				
				// drone attributes (if applicable)
				droneBay = 0;
				droneBandwidth = 0;
				
				// Cargo attributes
				cargoBay = 150;
				oreBay = 10000;
				
				// targeting attributes
				targetRange = 20;
				sigRadius = 40;
				
				// velocity attributes
				maxVelocity = 380;
				
				// Mining Frigate skill bonuses
				frigateYieldBonus = 1.05; // 5% bonus
				gasHarvDurBonus = 0.05; // 5% reduction
				
				// Expedition Frigate skill bonuses
				expeditionYieldBonus = 1.05; // 5% bonus
				
				// Role bonuses
				roleYieldBonus = 2; // 100% bonus
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

	public double getExpeditionYieldBonus() {
		return expeditionYieldBonus;
	}

	public void setExpeditionYieldBonus(double expeditionYieldBonus) {
		this.expeditionYieldBonus = expeditionYieldBonus;
	}

	public double getRoleYieldBonus() {
		return roleYieldBonus;
	}

	public void setRoleYieldBonus(double roleYieldBonus) {
		this.roleYieldBonus = roleYieldBonus;
	}
	

}
