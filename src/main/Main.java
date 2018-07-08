package main;

import java.util.Scanner;

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
		Calculator calc = new Calculator();

		// needed variables
		int shipChoice = 0;
		int modChoice = 0;
		int oreChoice = 0;
		int iceChoice = 0;
		int gasChoice = 0;
		int typeChoice = 0;
		int crystalChoice = 0;
		boolean useCrystal = false; 
		int miningSkill = 0;
		int astrogeoSkill= 0;
		int iceHarvestSkill= 0;
		int gasHarvestSkill= 0;
		int deepCoreSkill= 0;
		int frigateSkill= 0;
		int expeditionSkill= 0;
		int bargeSkill= 0;
		int exhumerSkill = 0;
		double totalYield = 0.0;



		// Introduction
		System.out.println("*****************");
		System.out.println("Welcome to the EVE Online Mining Calculator!");
		System.out.println("You'll be asked a number of questions to help us understand your character better.");
		System.out.println("In this segment you'll enter your skill levels...");

		// Ask the user to input their skill levels
		System.out.print("\nEnter your Mining Skill Level: ");
		miningSkill = input.nextInt();
		System.out.print("Enter your Astrogeology Skill Level: ");
		astrogeoSkill = input.nextInt();
		System.out.print("Enter your Ice Harvesting Skill Level: ");
		iceHarvestSkill = input.nextInt();
		System.out.print("Enter your Gas Cloud Harvesting Skill Level: ");
		gasHarvestSkill = input.nextInt();
		System.out.print("Enter your Deep Core Mining Skill Level: ");
		deepCoreSkill = input.nextInt();
		System.out.print("Enter your Mining Frigates Skill Level: ");
		frigateSkill = input.nextInt();
		System.out.print("Enter your Expedition Frigates Skill Level: ");
		expeditionSkill = input.nextInt();
		System.out.print("Enter your Mining Barge Skill Level: ");
		bargeSkill = input.nextInt();
		System.out.print("Enter your Exhumers Skill Level: ");
		exhumerSkill = input.nextInt();

		calc.Character(miningSkill, astrogeoSkill, iceHarvestSkill, 
				gasHarvestSkill, deepCoreSkill, frigateSkill, 
				expeditionSkill, bargeSkill, exhumerSkill);

		// user now needs to choose their ship 
		System.out.println("****************");
		System.out.println("Now you'll choose your ship. Based on your skills you can choose:");
		if(frigateSkill>=1) { // if the user has Mining Frigate I
			System.out.println("1. Venture");
		}if(expeditionSkill>=1 && frigateSkill == 5) { // if the user has Expedition Frigate I and Mining Frigate I
			System.out.println("2. Prospect");
			System.out.println("3. Endurance");
		}if(bargeSkill>=1 
				&& frigateSkill >= 3 
				&& astrogeoSkill >= 3
				&& miningSkill >= 4) { // if the user has Mining Barge I
			System.out.println("4. Procurer");
			System.out.println("5. Retriever");
			System.out.println("6. Covetor"); 
		}if(exhumerSkill >= 1) { // if the user has Exhumers I
			System.out.println("7. Skiff");
			System.out.println("8. Mackinaw");
			System.out.println("9. Hulk");
		}
		System.out.print("Enter the number of the corrosponding ship: ");
		shipChoice = input.nextInt();
		calc.Ship(shipChoice);
		//		System.out.println(calc.getName()); // debug

		
		// determine what type of mining the user is doing
		System.out.println("What type of mining are you doing?");
		System.out.println("1. Ore");
		//System.out.println("2. Ice");
		//System.out.println("3. Gas");
		typeChoice = input.nextInt();
		
		// user now needs to pick their module
		if(typeChoice == 1) { // Ore Mining Options
			System.out.println("Now pick your module: ");
			if (shipChoice >= 1 && shipChoice <= 3) {
				System.out.println("Mining Lasers: ");
				if(miningSkill >= 1 ) {
					System.out.println("1. Miner I");
					System.out.println("2. EP-S Gaussian Scoped Mining Laser");
					System.out.println("3. Particle Bore COmpact Mining Laser");
					System.out.println("4. Single Diode Basic Mining Laser (storyline)");
					System.out.println("5. ORE Miner (faction)");
					System.out.println("6. Gallente Mining Laser");
				}if(miningSkill == 5) {
					System.out.println("7. Miner II");
				}
				System.out.println("Deep Core Mining Lasers:");
				if(deepCoreSkill >= 1) {
					System.out.println("8. Deep Core Mining Laser I");
					System.out.println("9. ORE Deep Core Mining Laser");
				}if(deepCoreSkill == 5) {
					System.out.println("10. Modulated Deep Core Miner II");
				}
			}
			if (shipChoice >= 4) {
				System.out.println("1. Strip Miner I");
				System.out.println("2. Strip Miner II");
				System.out.println("3. Deep Core Strip Miner I");
			}
		} else if(typeChoice == 2) { // Ice Mining Options
			
			
		} else if(typeChoice == 3) { // Gas Mining Options
			
		}
		// user's choice will create the module
		System.out.print("Enter the number of the corrosponding module: ");
		modChoice = input.nextInt();
		calc.Mod(modChoice);

		// if user strip miner IIs we must verify if they are using crystals or not
		if (shipChoice >= 4 && modChoice == 2) {
			System.out.println("Are you using Mining Crystals? (Y/N)");

		}
		System.out.print("Enter here: ");

		String crystalChoice1 = input.next();
		if(crystalChoice1.equalsIgnoreCase("Y")) {
			useCrystal = true;
			System.out.println("Are you using: ");
			System.out.println("1. Tech 1 Mining Crystals");
			System.out.println("2. Tech 2 Mining Crystals");
		}
		System.out.print("Enter the corrosponding number: ");
		crystalChoice = input.nextInt();

		if(typeChoice == 1) {
			// user now needs to pick what type of Ore they're mining
			// for now only going to list Veldspar
			System.out.println("Now pick the Ore you are mining: ");
			System.out.println("1. Veldspar");
			/*
			System.out.println("2. Scordite");
			System.out.println("3. Pyroxeres");
			System.out.println("4. Plagioclase");
			System.out.println("5. Omber");
			System.out.println("6. Kernite");
			System.out.println("7. Jaspet");
			System.out.println("8. Hemorphite");
			System.out.println("9. Hedbergite");
			System.out.println("10. Gneiss");
			System.out.println("11. Dark Ochre");
			System.out.println("12. Spodumain");
			System.out.println("13. Crokite");
			System.out.println("14. Arkonor");
			System.out.println("15. Bistot");
			if (modChoice >= 8) {
				System.out.println("16. Mercoxit");
				
			} else if (shipChoice >= 4 && modChoice == 3) {
				System.out.println("16. Mercoxit");
			}
			*/
	
			// user's choice will create the Ore
			System.out.print("Enter the corrosponding number: ");
			oreChoice = input.nextInt();
			calc.Ore(oreChoice);
		} else if (typeChoice == 2) {
			// user needs to pick the Ice they are mining
			System.out.println("Now pick the type of Ice you are mining: ");
			System.out.println("1. Clear Icicle");
			System.out.println("2. White Glaze");
			System.out.println("3. Blue Ice");
			System.out.println("4. Glacial Mass");
			System.out.println("5. Glare Crust");
			System.out.println("6. Dark Glitter");
			System.out.println("7. Gelidus");
			System.out.println("8. Krystallos");
			
			System.out.print("Enter the corrosponding number: ");
			/*
			iceChoice = input.nextInt();
			calc.Ice(iceChoice);
			*/
		} else if (typeChoice == 3) {
			
		}
		//basic formula for mining yields
		/*
		 * TotalYield = BaseModYield * (1.05 * MiningLevel) * (1.05 * AstrogeoLevel) * (Role Bonus) * (Ship bonus)
		 */
		// formulas are going to be dependent on ship class (Mining Frigate, Expedition, Barge, Exhumer)
		System.out.println();
		System.out.println(calc.toString()); // debug
		System.out.println();
		totalYield = calc.Yield(shipChoice);
		System.out.println("Total Yield is " +totalYield+" units per cycle." );





		// close the scanner
		input.close();

	}

}
