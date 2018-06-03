package main;

import java.util.Scanner;

import character.Character;

public class Main {

	public static void main(String[] args) {
		// Instantiate classes
		Scanner input = new Scanner(System.in);
		Character user = new Character();
		
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
		
		// close the scanner
		input.close();
		
	}

}
