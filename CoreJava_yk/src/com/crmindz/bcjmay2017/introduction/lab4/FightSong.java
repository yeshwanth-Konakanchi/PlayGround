package com.crmindz.bcjmay2017.introduction.lab4;

/**
 * @author Yeshwanth Konakanchi
 *This class prints the fight song
 */
public class FightSong {
	
	
	/**
	 * This method prints repeat lines in the song
	 */
	static void printFirstParagraph(){
		
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	
	/**
	 * This method prints the whole fight song
	 */
	static void printFightSong(){
		
		printFirstParagraph();
		
		System.out.println();
		
		for(int i=0; i<2; i++){
			printFirstParagraph();
			System.out.println("You can do it,");
			System.out.println("In the West.");
			System.out.println();
		}
		
		printFirstParagraph();
	}

	public static void main(String[] args) {
		printFightSong();

	}

}
