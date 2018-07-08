package main;

import character.Character;
import modules.*;
import ores.*;
import ships.*;


/*
 * Will move a lot of the code in the main here after I'm sure forumlas work correctly
 * Still planning on how this will work
 * @author Shawn Potter
 * TODO:  
 * 1. Create Ice Method
 * 2. Modify Mod method to accept a second variable, a boolean for if the mod 
 *    is using crystals. All mods that can't use crystals will automatically
 *    have boolean set to false.
 */

public class Calculator {
	// needed variables
	String shipName = "";
	public int numMods = 0; //how many mods a ship can field
	public double roleYBonus = 0.0;
	public double shipYBonus = 0.0;
	public double shipGasRDuration = 0.0;
	public double roleRDuration = 0.0;
	public double advRDuration = 0.0; 
	public double advYBonus = 0.0;
	public double modYield = 0.0;
	//double totalYield = 0.0;
	public double oreVolume = 0.0;
	
	// character variables
	public int miningSkill = 0;
	public int astrogeoSkill= 0;
	public int iceHarvestSkill= 0;
	public int gasHarvestSkill= 0;
	public int deepCoreSkill= 0;
	public int frigateSkill= 0;
	public int expeditionSkill= 0;
	public int bargeSkill= 0;
	public int exhumerSkill = 0;
	
	
	public Calculator() {
		
	}
	public double Yield(int shipChoice) {
		double totalYield = 0.0;
		if (shipChoice >= 1 && shipChoice <= 3) {
			totalYield = modYield 
					* (1 + (0.05 * miningSkill)) 
					* (1 + (0.05 * astrogeoSkill)) 
					* (roleYBonus + 1) 
					* (1 + (shipYBonus * frigateSkill))
					* (1 + (advYBonus * frigateSkill))
					* numMods;
		}else if(shipChoice >= 4 && shipChoice <= 9) {
			totalYield = modYield 
					* (1 + (0.05 * miningSkill)) 
					* (1 + (0.05 * astrogeoSkill)) 
					* (roleYBonus + 1) 
					* (1 + (shipYBonus * bargeSkill))
					* (1 + (advYBonus * exhumerSkill))
					* numMods;
		}
		return totalYield;
	}
	
	public void Ship(int shipChoice) {
		Object ship = null;
		if(shipChoice == 1) {
			ship = new Venture();
		}else if(shipChoice == 2) {
			ship = new Prospect();
		}else if(shipChoice == 3) {
			ship = new Endurance();
		}else if(shipChoice == 4) {
			ship = new Procurer();
		}else if(shipChoice == 5) {
			ship = new Retriever();
		}else if(shipChoice == 6) {
			ship = new Covetor();
		}else if(shipChoice == 7) {
			ship = new Skiff();		
		}else if(shipChoice == 8) {
			ship = new Mackinaw();
		}else if(shipChoice == 9) {
			ship = new Hulk();
		}
		this.shipName = ((Ship) ship).getName();
		this.numMods = ((Ship) ship).getTurrets();
		this.shipYBonus = ((Ship) ship).getShipYieldBonus();
		this.shipGasRDuration = ((Ship) ship).getGasReduceDuration();
		this.roleYBonus = ((Ship) ship).getRoleYieldBonus();
		this.roleRDuration = ((Ship) ship).getRoleReduceDuration();
		this.advRDuration = ((Ship) ship).getAdvShipReduceDuration(); 
		this.advYBonus = ((Ship) ship).getAdvShipYieldBonus();
		 
	}
	
	public void Ore(int oreChoice) {
		Object ore = null;
		if(oreChoice == 1) {
			ore = new Veldspar();
		}else if (oreChoice == 1){
			ore = new Scordite();
		}else if (oreChoice == 2){
			ore = new Pyroxeres();
		}else if (oreChoice == 3){
			ore = new Plagioclase();
		}else if (oreChoice == 4){
			ore = new Omber();
		}else if (oreChoice == 5){
			ore = new Kernite();
		}else if (oreChoice == 6){
			ore = new Jaspet();
		}else if (oreChoice == 7){
			ore = new Hemorphite();
		}else if (oreChoice == 8){
			ore = new Hedbergite();
		}else if (oreChoice == 9){
			ore = new Gneiss();
		}else if (oreChoice == 10){
			ore = new DarkOchre();
		}else if (oreChoice == 11){
			ore = new Spodumain();
		}else if (oreChoice == 12){
			ore = new Crokite();
		}else if (oreChoice == 13){
			ore = new Arkonor();
		}else if (oreChoice == 14){
			ore = new Bistot();
		}else if (oreChoice == 15){
			ore = new Mercoxit();
		}
		this.oreVolume = ((Ore) ore).getVolume();
	}
		
	public void Mod(int modChoice) {
		Object mod = null;
		if(modChoice == 1) {
			mod = new Miner1();
		}else if (modChoice == 2) {
			mod = new Gaussian();
		}else if (modChoice == 3) {
			mod = new ParticleBore();
		}else if (modChoice == 4) {
			mod = new SingleDiode();
		}else if (modChoice == 5) {
			mod = new OREMiner();
		}else if (modChoice == 6) {
			mod = new GallenteLaser();
		}else if (modChoice == 7) {
			mod = new Miner2();
		}else if (modChoice == 8) {
			mod = new DeepCore1();
		}else if (modChoice == 9) {
			mod = new Miner2();
		}else if (modChoice == 10) {
			mod = new Miner2();
		}
		this.modYield = ((Mod) mod).getYield();
	}
	public void Character(int a, int b, int c, int d, int e, 
			int f, int g, int h, int i) {
		Character user = new Character(a,b,c,d,e,f,g,h,i);
		this.miningSkill = user.getMiningSkill();
		this.astrogeoSkill= user.getAstrogeoSkill();
		this.iceHarvestSkill= user.getIceHarvestSkill();
		this.gasHarvestSkill= user.getGasHarvestSkill();
		this.deepCoreSkill= user.getDeepCoreSkill();
		this.frigateSkill= user.getFrigateSkill();
		this.expeditionSkill= user.getExpeditionSkill();
		this.bargeSkill= user.getBargeSkill();
		this.exhumerSkill = user.getExhumerSkill();
	}
	
	// debug methods
/*	public String getName() { 
		return shipName;
	}
	
	public String getShipName() {
		return shipName;
	}
	public int getNumMods() {
		return numMods;
	}
	public double getRoleYBonus() {
		return roleYBonus;
	}
	public double getShipYBonus() {
		return shipYBonus;
	}
	public double getShipGasRDuration() {
		return shipGasRDuration;
	}
	public double getRoleRDuration() {
		return roleRDuration;
	}
	public double getAdvRDuration() {
		return advRDuration;
	}
	public double getAdvYBonus() {
		return advYBonus;
	}
	public double getModYield() {
		return modYield;
	}
	public double getOreVolume() {
		return oreVolume;
	}
	@Override
	public String toString() {
		return "Calculator [shipName=" + shipName + ", numMods=" + numMods + ", roleYBonus=" + roleYBonus + ", \nshipYBonus="
				+ shipYBonus + ", shipGasRDuration=" + shipGasRDuration + ", roleRDuration=" + roleRDuration
				+ ", advRDuration=" + advRDuration + ", advYBonus=" + advYBonus + ", modYield=" + modYield
				+ ", oreVolume=" + oreVolume + "]";
	}
	*/
}
