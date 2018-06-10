/**
 * EVE Online Character skills that are relevant to the calculator.
 * Other skills outside of these are mostly irrelevant, excluding
 * any updates in the future.
 * 
 * @author Shawn Potter
 */

package character;

public class Character {
	private int miningSkill;
	private int astrogeoSkill;
	private int iceHarvestSkill;
	private int gasHarvestSkill;
	private int deepCoreSkill;
	private int frigateSkill;
	private int expeditionSkill;
	private int bargeSkill;
	private int exhumerSkill;
	
	// these skills have no impact on the program
	
	// private int IndustCommandSkill; // unused as of right now
	// private int CapitalSkill; // unused as of right now

	// default constructor
	public Character() {
		// TODO Auto-generated constructor stub
	}

	// multi param constructor
	public Character(int miningSkill, int astrogeoSkill, int iceHarvestSkill, int gasHarvestSkill, int deepCoreSkill,
			int frigateSkill, int expeditionSkill, int exhumerSkill) {
		super();
		this.miningSkill = miningSkill;
		this.astrogeoSkill = astrogeoSkill;
		this.iceHarvestSkill = iceHarvestSkill;
		this.gasHarvestSkill = gasHarvestSkill;
		this.deepCoreSkill = deepCoreSkill;
		this.frigateSkill = frigateSkill;
		this.expeditionSkill = expeditionSkill;
		this.exhumerSkill = exhumerSkill;
	}
	// Getters and Setters
	public int getMiningSkill() {
		return miningSkill;
	}

	public void setMiningSkill(int miningSkill) {
		this.miningSkill = miningSkill;
	}

	public int getAstrogeoSkill() {
		return astrogeoSkill;
	}

	public void setAstrogeoSkill(int astrogeoSkill) {
		this.astrogeoSkill = astrogeoSkill;
	}

	public int getIceHarvestSkill() {
		return iceHarvestSkill;
	}

	public void setIceHarvestSkill(int iceHarvestSkill) {
		this.iceHarvestSkill = iceHarvestSkill;
	}

	public int getGasHarvestSkill() {
		return gasHarvestSkill;
	}

	public void setGasHarvestSkill(int gasHarvestSkill) {
		this.gasHarvestSkill = gasHarvestSkill;
	}

	public int getDeepCoreSkill() {
		return deepCoreSkill;
	}

	public void setDeepCoreSkill(int deepCoreSkill) {
		this.deepCoreSkill = deepCoreSkill;
	}

	public int getFrigateSkill() {
		return frigateSkill;
	}

	public void setFrigateSkill(int frigateSkill) {
		this.frigateSkill = frigateSkill;
	}

	public int getExpeditionSkill() {
		return expeditionSkill;
	}

	public void setExpeditionSkill(int expeditionSkill) {
		this.expeditionSkill = expeditionSkill;
	}

	public int getBargeSkill() {
		return bargeSkill;
	}

	public void setBargeSkill(int bargeSkill) {
		this.bargeSkill = bargeSkill;
	}

	public int getExhumerSkill() {
		return exhumerSkill;
	}

	public void setExhumerSkill(int exhumerSkill) {
		this.exhumerSkill = exhumerSkill;
	}
	//toString
	@Override
	public String toString() {
		return "Character [miningSkill=" + miningSkill + ", astrogeoSkill=" + astrogeoSkill + ", iceHarvestSkill="
				+ iceHarvestSkill + ", gasHarvestSkill=" + gasHarvestSkill + ", deepCoreSkill=" + deepCoreSkill
				+ ", frigateSkill=" + frigateSkill + ", expeditionSkill=" + expeditionSkill + ", bargeSkill="
				+ bargeSkill + ", exhumerSkill=" + exhumerSkill + "]";
	}

	
	
	
}
