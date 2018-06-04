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
		user.setBargeSkills(input.nextInt());
		
		System.out.print("Enter your Exhumers Skill Level: ");
		user.setExhumerSkill(input.nextInt());
		
		// user now needs to choose their ship 
		System.out.println("****************");
		System.out.println("Now you'll choose your ship. Based on your skills you can choose:");
		if(user.getFrigateSkill()>=1) { // if the user has Mining Frigate I
			System.out.println("1. Venture");
		} if(user.getExpeditionSkill()>=1 && user.getFrigateSkill() == 5) { // if the user has Expedition Frigate I and Mining Frigate I
			System.out.println("2. Prospect");
			System.out.println("3. Endurance");
		} /*if(user.getBargeSkills()>=1 
				&& user.getFrigateSkill() >=3 
				&& user.getAstrogeoSkill()>=3
				&& user.getMiningSkill()>=4) { // if the user has Mining Barge I
			System.out.println("4. Procurer");
			System.out.println("5. Retriever"); // CURRENTLY UNUSED
			System.out.println("6. Covetor"); 
		} if(user.getExhumerSkill()>=1) { // if the user has Exhumers I
			System.out.println("7. Skiff");
			System.out.println("8. Mackinaw");
			System.out.println("9. Hulk");
		}*/
		System.out.print("Enter the number of the corrosponding ship: ");
		shipChoice = input.nextInt();
		
		// the user's choice will now be used to create the ship
		if(shipChoice == 1) {
			Ship ship = new Venture();
		}else if(shipChoice == 2) {
			Ship ship = new Prospect();
		}else if(shipChoice == 3) {
			Ship ship = new Endurance();
		}/*else if(shipChoice == 4) {
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
		*/
		
		// user now needs to pick their module
		System.out.println("Now pick your module: ");
		if(user.getMiningSkill()>=1) {
			System.out.println("1. Miner I");
		}if(user.getMiningSkill()==5) {
			System.out.println("2. Miner II");
		}
		
		// user's choice will create the module
		System.out.print("Enter the number of the corrosponding module: ");
		modChoice = input.nextInt();
		if(modChoice == 1) {
			Mod mod = new Miner1();
		}else if (modChoice == 2) {
			Mod mod = new Miner2();
		}
		
		
		
		// close the scanner
		input.close();
		
	}

}
