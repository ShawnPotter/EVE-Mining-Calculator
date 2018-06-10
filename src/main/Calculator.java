package main;

import character.Character;

/*
 * Will move a lot of the code in the main here after I'm sure forumlas work correctly
 * Still planning on how this will work
 * @author Shawn Potter
 */

public class Calculator {
	Character user = new Character();
	// needed variables
	int shipChoice = 0;
	int modChoice = 0;
	int oreChoice = 0;
	String shipName = "";
	int numMods = 0; //how many mods a ship can field
	double roleYBonus = 0;
	double shipYBonus = 0;
	double shipRDuration = 0;
	double roleRDuration = 0;
	double advRDuration = 0; 
	double advYBonus = 0;
	double modYield = 0;
	double totalYield = 0;
	private Object ore;
	
	public Calculator() {
		
	}
	/*public void Yield(int shipChoice) {
		if (shipChoice >= 1 && shipChoice <= 3) {
			totalYield = modYield 
					* (1 + (0.05 * user.getMiningSkill())) 
					* (1 + (0.05 * user.getAstrogeoSkill())) 
					* (roleYBonus + 1) 
					* (1 + (shipYBonus * user.getFrigateSkill()))
					* (1 + (advYBonus * user.getExpeditionSkill()))
					* numMods;
		}else if(shipChoice >= 4 && shipChoice <= 9) {
			totalYield = modYield 
					* (1 + (0.05 * user.getMiningSkill())) 
					* (1 + (0.05 * user.getAstrogeoSkill())) 
					* (roleYBonus + 1) 
					* (1 + (shipYBonus * user.getBargeSkill()))
					* (1 + (advYBonus * user.getExhumerSkill()))
					* numMods;
		}
	}
	
	public void Ship(int shipChoice) {
		if(shipChoice == 1) {
			Ship ship = new Venture();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 2) {
			Ship ship = new Prospect();
		}else if(shipChoice == 3) {
			Ship ship = new Endurance();
		}else if(shipChoice == 4) {
			Ship ship = new Procurer();
		}else if(shipChoice == 5) {
			Ship ship = new Retriever();
		}else if(shipChoice == 6) {
			Ship ship = new Covetor();
		}else if(shipChoice == 7) {
			Ship ship = new Skiff();		// currently unused
		}else if(shipChoice == 8) {			// haven't built classes for these yet
			Ship ship = new Mackinaw();
		}else if(shipChoice == 9) {
			Ship ship = new Hulk();
		}
		 
	}
	
	public void Ore(int oreChoice) {
		if(oreChoice == 1) {
			Ore ore = new Veldspar();
		}else {
			Ore ore = new Mercoxit();
		}
		return ore;
	}
		
	public void Mod(int modChoice) {
		if(modChoice == 1) {
			Mod mod = new Miner1();
			modYield = mod.getYield();
		}else if (modChoice == 2) {
			Mod mod = new Miner2();
			modYield = mod.getYield();
		}
	}
	public void Character() {
		Character user = new Character();
	}
*/
}
