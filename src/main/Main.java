package main;

import java.util.Scanner;
import character.Character;
import modules.*;
import ores.*;
import ships.*;

/**
 * 
 * The launcher for the calculator. Currently only running on System output,
 * will update at some point to run in a GUI. First in the current format
 * and maybe later using things like buttons and radio buttons.
 * 
 * I've actually made both a version almost exactly like this and one with a GUI 
 * in Python for finals in my IT classes. Currently still planning out this class more or less.
 * 
 * @author Shawn Potter
 */

public class Main {

	public static void main(String[] args) {
		// Instantiate classes
		Scanner input = new Scanner(System.in);
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
		
		
		
		// Introduction
		System.out.println("*****************");
		System.out.println("Welcome to the EVE Online Mining Calculator!");
		System.out.println("You'll be asked a number of questions to help us understand your character better.");
		System.out.println("In this segment you'll enter your skill levels...");
		
		// Ask the user to input their skill levels
		System.out.print("\nEnter your Mining Skill Level: ");
		user.setMiningSkill(input.nextInt());
		
		System.out.print("Enter your Astrogeology Skill Level: ");
		user.setAstrogeoSkill(input.nextInt());
		
		System.out.print("Enter your Ice Harvesting Skill Level: ");
		user.setIceHarvestSkill(input.nextInt());
		
		System.out.print("Enter your Gas Cloud Harvesting Skill Level: ");
		user.setGasHarvestSkill(input.nextInt());
		
		System.out.print("Enter your Deep Core Mining Skill Level: ");
		user.setDeepCoreSkill(input.nextInt());
		
		System.out.print("Enter your Mining Frigates Skill Level: ");
		user.setFrigateSkill(input.nextInt());
		
		System.out.print("Enter your Expedition Frigates Skill Level: ");
		user.setExpeditionSkill(input.nextInt());
		
		System.out.print("Enter your Mining Barge Skill Level: ");
		user.setBargeSkill(input.nextInt());
		
		System.out.print("Enter your Exhumers Skill Level: ");
		user.setExhumerSkill(input.nextInt());
		
		// user now needs to choose their ship 
		System.out.println("****************");
		System.out.println("Now you'll choose your ship. Based on your skills you can choose:");
		if(user.getFrigateSkill()>=1) { // if the user has Mining Frigate I
			System.out.println("1. Venture");
		}if(user.getExpeditionSkill()>=1 && user.getFrigateSkill() == 5) { // if the user has Expedition Frigate I and Mining Frigate I
			System.out.println("2. Prospect");
			System.out.println("3. Endurance");
		}if(user.getBargeSkill()>=1 
				&& user.getFrigateSkill() >=3 
				&& user.getAstrogeoSkill()>=3
				&& user.getMiningSkill()>=4) { // if the user has Mining Barge I
			System.out.println("4. Procurer");
			System.out.println("5. Retriever");
			System.out.println("6. Covetor"); 
		}if(user.getExhumerSkill()>=1) { // if the user has Exhumers I
			System.out.println("7. Skiff");
			System.out.println("8. Mackinaw");
			System.out.println("9. Hulk");
		}
		System.out.print("Enter the number of the corrosponding ship: ");
		shipChoice = input.nextInt();
		
		// the user's choice will now be used to create the ship
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
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 3) {
			Ship ship = new Endurance();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 4) {
			Ship ship = new Procurer();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 5) {
			Ship ship = new Retriever();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 6) {
			Ship ship = new Covetor();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 7) {
			Ship ship = new Skiff();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 8) {
			Ship ship = new Mackinaw();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}else if(shipChoice == 9) {
			Ship ship = new Hulk();
			shipName = ship.getName();
			numMods = ship.getTurrets();
			shipYBonus = ship.getShipYieldBonus();
			shipRDuration = ship.getGasReduceDuration();
			roleYBonus = ship.getRoleYieldBonus();
			roleRDuration = ship.getRoleReduceDuration();
			advRDuration = ship.getAdvShipReduceDuration(); 
			advYBonus = ship.getAdvShipYieldBonus();
		}
		
		// user now needs to pick their module
		System.out.println("Now pick your module: ");
		System.out.println("Mining Lasers: ");
		if(user.getMiningSkill() == 1 ) {
			System.out.println("1. Miner I");
			System.out.println("2. EP-S Gaussian Scoped Mining Laser");
			System.out.println("3. Particle Bore COmpact Mining Laser");
			System.out.println("4. Single Diode Basic Mining Laser (storyline)");
			System.out.println("5. ORE Miner (faction)");
			System.out.println("6. Gallente Mining Laser");
		}if(user.getMiningSkill() == 5) {
			System.out.println("7. Miner II");
		}
		System.out.println("Deep Core Mining Lasers:");
		if(user.getDeepCoreSkill() == 1) {
			System.out.println("8. Deep Core Mining Laser I");
			System.out.println("9. ORE Deep Core Mining Laser");
		}if(user.getDeepCoreSkill() == 5) {
			System.out.println("10. Modulated Deep Core Miner II");
		}
		
		// user's choice will create the module
		System.out.print("Enter the number of the corrosponding module: ");
		modChoice = input.nextInt();
		if(modChoice == 1) {
			Mod mod = new Miner1();
			modYield = mod.getYield();
		}else if (modChoice == 2) {
			Mod mod = new Miner2();
			modYield = mod.getYield();
		}
		
		// user now needs to pick what type of Ore they're mining
		// for now only going to list Veldspar
		System.out.println("Now pick the Ore you are mining: ");
		System.out.println("1. Veldspar");
		
		// user's choice will create the Ore
		System.out.println();
		oreChoice = input.nextInt();
		if(oreChoice == 1) {
			Ore ore = new Veldspar();
		}
		
		
		//basic formula for mining yields
		/*
		 * TotalYield = BaseModYield * (1.05 * MiningLevel) * (1.05 * AstrogeoLevel) * (Role Bonus) * (Ship bonus)
		 */
		// formulas are going to be dependant on ship class (Mining Frigate, Expedition, Barge, Exhumer)
		
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
		System.out.println("Total Yield is " +totalYield+" units per cycle." );
		
		
		
		
		
		// close the scanner
		input.close();
		
	}

}
