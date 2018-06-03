package ships;

public class Endurance extends Ship {
	private double frigateYieldBonus;
	private double iceDurBonus;
	private double expeditionIceDur; // 5% reduction in Ice Harvesting duration
	private double roleYieldBonus;
	private double roleIceDurBonus;
	
	public Endurance() {
		// TODO Auto-generated constructor stub
	}

	public Endurance(int highSlots, int midSlots, int lowSlots, int droneBay, int droneBandwidth, double cargoBay,
			double oreBay, double targetRange, double sigRadius, double maxVelocity) {
		super(highSlots, midSlots, lowSlots, droneBay, droneBandwidth, cargoBay, oreBay, targetRange, sigRadius,
				maxVelocity);
		// fitting attributes
		highSlots = 3;
		midSlots = 4;
		lowSlots = 3;
		
		// drone attributes (if applicable)
		droneBay = 30;
		droneBandwidth = 15;
		
		// Cargo attributes
		cargoBay = 200;
		oreBay = 15000;
		
		// targeting attributes
		targetRange = 20;
		sigRadius = 40;
		
		// velocity attributes
		maxVelocity = 420;
		
		// Mining Frigate skill bonuses
		frigateYieldBonus = 1.05; // 5% bonus
		iceDurBonus = 0.05; // 5% reduction
		
		// Expedition Frigate skill bonuses
		expeditionIceDur = 0.05; // 5% reduction
		
		// Role bonuses
		roleYieldBonus = 4; // 300% bonus
		roleIceDurBonus = 0.5; // 50% reduction
	}

	public double getFrigateYieldBonus() {
		return frigateYieldBonus;
	}

	public void setFrigateYieldBonus(double frigateYieldBonus) {
		this.frigateYieldBonus = frigateYieldBonus;
	}

	public double getIceDurationBonus() {
		return iceDurBonus;
	}

	public void setIceDurationBonus(double iceDurBonus) {
		this.iceDurBonus = iceDurBonus;
	}

	public double getExpeditionIceDuration() {
		return expeditionIceDur;
	}

	public void setExpeditionIceDuration(double expeditionIceDur) {
		this.expeditionIceDur = expeditionIceDur;
	}

	public double getRoleYieldBonus() {
		return roleYieldBonus;
	}

	public void setRoleYieldBonus(double roleYieldBonus) {
		this.roleYieldBonus = roleYieldBonus;
	}

	public double getRoleIceDurationBonus() {
		return roleIceDurBonus;
	}

	public void setRoleIceDurationBonus(double roleIceDurBonus) {
		this.roleIceDurBonus = roleIceDurBonus;
	}
	

}
