/* Jonathan Abdo
 * 6-6-2016
 * Create a Choose your own adventure game!
 */

import java.util.Scanner;

public class GameOfChoices {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//declare any variables needed
		String name, hair, house;
		
		System.out.println("Welcome to the Game of Thrones!!! err Choices!!!\n");
		//take user info!
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your hair color: ");
		hair = sc.nextLine();
		System.out.println("Choose a house (Stark, Lannister or Targaryen)");
		house = sc.nextLine();
		
		//send user to appropriate story arc for house chosen
		
	}
	
	public void stark(String name, String hair){
		
	}

}
