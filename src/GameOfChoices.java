/* Jonathan Abdo
 * 6-6-2016
 * Create a Choose your own adventure game!
 */

import java.util.Scanner;

public class GameOfChoices {
	//declare any global variables needed
	static Scanner sc = new Scanner(System.in);
	static String name, hair, house;

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Game of Thrones!!! err Choices!!!\n");
		//take user info!
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your hair color: ");
		hair = sc.nextLine().toLowerCase();
		
		//send user to stark storyline
		stark(1);
		System.out.println("THE END!\nThanks for playing!");
	}
	
	//story arc for the stark family
	public static void stark(int storyPoint){
		int choice=0, savedWolf=0;
		
		switch(storyPoint){
		case 1: 
			System.out.println("\nWinterfell is especially cold today, "+name+
					" is walking along the outside walls. \nThe wind is bitter and flows through your "+hair+
					" hair. \nYou see a dire wolf struggling to get out of a bear trap.");
			System.out.println("What do you do? \n1. Avoid the dire wolf. \n2. Help the dire wolf.");
			choice = setRange("What do you do? \n1. Avoid the dire wolf. \n2. Help the dire wolf.", 2);
			if(choice==1)
				stark(2);
			else stark(3);
			break;
		case 2: 
			System.out.println("You keep a good distance between yourself and the dire wolf as you walk around. "+
					"\nAs you walk further into the forest you notice your breath is visible. "+
					"\nYou're shivering now, rubbing your hands together does nothing to fight off this cold. ");
			System.out.println("1.Continue on your patrol. \n2.Turn back and seek warmth.");
			choice = setRange("1.Continue on your patrol. \n2.Turn back and seek warmth.", 2);
			if(choice==1)
				stark(4);
			else stark(5);
		
			break;
		case 3: 
			savedWolf=1;
			System.out.println("You slowly walk up to the dire wolf. It growls at you and lowers it's head. "+
					"\nIt doesn't phase you, you slowly reach for the bear trap and struggle to pull it open. "+
					"\nThe wolf quickly pulls its leg out of the trap and runs off. You watch as it disappears into the forest."
					+ "\n Do you?");
			System.out.println("1.Continue on your patrol. \n2.Turn back and seek warmth.");
			choice = setRange("1.Continue on your patrol. \n2.Turn back and seek warmth.", 2);
			if(choice==1)
				stark(4);
			else stark(5);
			break;
		case 4:
			System.out.println("It's freezing now and the house words echo in your mind, \"winter is coming\"."
					+"\nSomething yells \""+name.toUpperCase()+"!\" and you turn towards it."
					+"\nYou see a whitewalker staring at you with cold blue eyes."
					+" It starts sprinting towards you!\nDo you?");
			System.out.println("1.Unsheath your sword!\n2.RUN!");
			choice = setRange("1.Unsheath your sword!\n2.RUN!",2);
			if(choice==1)
				stark(6);
			else
				stark(7);
			break;
		case 5: 
			
			break;
		case 6:
			if(savedWolf==1)
				System.out.println("Before you can react it's in front of you, arms stretching for you!"
						+"\nAs it's about to grab you the dire wolf slams into the whitewalker taking it to the ground!"
						+ "\nGiving you just enough time to draw your sword and take off the whitewalker's head."
						+ "\nAs the dire wolf heads back into the forest you take the head of the whitewalker"
						+ "\n back to Winterfell to warn everyone of their return.");
			else
				System.out.println("Before you can react it's in front of you, arms stretching for you!"
						+"\nYou try to unsheath your sword but it's too late, the whitewalker grabs you and"
						+ "\nslams you to the ground. Your vision goes black from the impact and the last thing"
						+ "\nyou feel is the wet feeling of your blood pooling around you...");
			break;
		case 7:
			if(savedWolf==1)
				System.out.println("Before you can react it's in front of you, arms stretching for you!"
						+"\nAs it's about to grab you the dire wolf slams into the whitewalker taking it to the ground!"
						+ "\nGiving you just enough time to make a run for it."
						+ "\nYou hear the wolf cry out in pain as you run back to Winterfell.");
			else
				System.out.println("Before you can react it's in front of you, arms stretching for you!"
						+"\nYou try to run but it's too late, the whitewalker grabs you and"
						+ "\nslams you to the ground. Your vision goes black from the impact and the last thing"
						+ "\nyou feel is the wet feeling of your blood pooling around you...");
		}
		
		
	}
	
	//sets the range from 1-max for numerical choices in the story, also passes the choices available from the story
	public static int setRange(String choices, int max){
		
		int correctInput = getInt(choices);
		
		while ((correctInput==0)||(correctInput>max)){
			System.out.println("Please enter a valid choice.");
			System.out.println(choices);
			correctInput = getInt(choices);
		}
		
		return correctInput;
	}
	
	//checks the user's input for a valid number and presents that valid choices passed to it from the story
	public static int getInt(String choices){
		int correctInput=0;

		while (!sc.hasNextInt()){
			System.out.println("Please enter a valid choice.");
			System.out.println(choices);
			sc.nextLine();
		}
		correctInput = sc.nextInt();
		
		return correctInput;
	}

}
