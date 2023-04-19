// Story Name: Escape the Dark Dimension
// Programmer Name: Erin Hu
// Version Number: ??

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midterm{
	public static void main(String[] args){
		// Console
		Console con = new Console("Escape the Dark Dimension", 1280, 720);
		con.setBackgroundColor(Color.WHITE);
		con.setTextColor(Color.BLACK); // could set to custom rgb colour
		con.println("TEMP - Scene 0");
		// SCENE 1 VARIABLES
		String strChoice; 
		// SCENE 2 VARIABLES
		int intGuess;
		int intRand;
		int intCount;
		// SCENE 8 VARIABLES
		String strName;
		String strLetter;
		int intCount2;
		int intLength;
		int intCheck;
		intCheck = 0;
		// SCENE 10 VARIABLES
		int intCookies;
		double dblSwim;
		double dblHyp;
		char charFood;
		// SCENE 1 - CHOICE
		scene1(con);
		con.println("Do you \"give up\" or \"keep swimming\"?");
		strChoice = con.readLine();
		if(strChoice.equalsIgnoreCase("give up")){
			con.clear();
			// SCENE 2 - CHOICE
			scene2(con);
			con.println("You will enter a number between 1 and 3 inclusive to see if you can open it.");
			con.println("You get 10 attempts.");
			for(intCount = 1; intCount <= 10; intCount++){
				intRand = (int)(Math.random() * 4 + 1);
				con.println("Guess "+intCount+":");
				intGuess = con.readInt();
				if(intGuess == intRand){
					intCount = 11;
					con.clear();
					// SCENE 8 - CHOICE
					scene8(con);
					con.println("Enter your name carefully: ");
					strName = con.readLine();
					intLength = strName.length();
					for(intCount2 = intLength; intCount2 >= 1; intCount2--){
						strLetter = strName.substring(intCount2 - 1, intCount2);
						// con.println("test"+strLetter);
						if(strLetter.equalsIgnoreCase("a") || strLetter.equalsIgnoreCase("e") || strLetter.equalsIgnoreCase("i") || strLetter.equalsIgnoreCase("o") || strLetter.equalsIgnoreCase("u")){
							intCheck = intCheck + 0;
							// con.println("test"+intCheck);
						}else{
							intCheck = intCheck + 1;
							// con.println("test"+intCheck);
						}
					}
					if(intCheck >= 1){
						strName = "Not all vowels";
						// con.println("test"+strName);
					}else{
						strName = "All vowels";
						// con.println("test"+strName);
					}
					con.clear();
					if(strName.equals("Not all vowels")){
						// SCENE 9
						con.clear();
						scene9(con);
						con.println("TEMP - not all vowels");
					}else{
						// SCENE 10 - CHOICE
						con.clear();
						scene10(con);
						con.println("How many cookies do you take?");
						intCookies = con.readInt();
						if(intCookies == 10 || intCookies == 0){
							con.clear();
							// SCENE 9
							scene9(con);
						}else if(intCookies >= 1 && intCookies <= 9){
							con.clear();
							// SCENE 11
							scene11(con);
						}
					}
				}else if(intGuess != intRand && intCount == 10){
					intCount = 11;
					con.clear();
					scene7(con);
				}
			}
		}else if(strChoice.equalsIgnoreCase("keep swimming")){
			con.clear();
			scene3(con);
		}
	}
	// SCENE 1
	public static void scene1(Console con){
		// BufferedImage imgScene1 = con.loadImage("Scene1.jpeg");
		// con.drawImage(imgScene1, 0, 0);
		con.println("TEMP - Scene 1");
		con.println("You woke up to find yourself drowning in an unknown liquid.");
		con.println("It is very sticky and dense.");
	}
	// SCENE 2
	public static void scene2(Console con){
		con.println("TEMP - Scene 2");
		con.println("You sink, then find a button with a sliding door.");
	}
	// SCENE 3
	public static void scene3(Console con){
		con.println("TEMP - Scene 3");
	}
	// SCENE 4
	public static void scene4(Console con){
		con.println("TEMP - Scene 4");
	}
	// SCENE 5
	public static void scene5(Console con){
		con.println("TEMP - Scene 5");
	}
	// SCENE 6
	public static void scene6(Console con){
		con.println("TEMP - Scene 6");
	}
	// SCENE 7
	public static void scene7(Console con){
		con.println("TEMP - Scene 7");
		con.println("All this swimming has tired you out.");
		con.println("You run out of air and energy.");
		con.println("You feel your consciousness slowly slipping away, as you fight to survive.");
		con.println("A fish eats you.");
		con.println("You die. Game over.");
	}
	// SCENE 8
	public static void scene8(Console con){
		con.println("TEMP - Scene 8");
		con.println("You open the door and quickly go in.");
		con.println("A giant cube asks you what your name is.");
		con.println("The cube is very picky. It tells you to be aware of your surroundings.");
		con.println("TEMP - enter only vowels");
	}
	// SCENE 9
	public static void scene9(Console con){
		con.println("TEMP - Scene 9");
	}
	// SCENE 10
	public static void scene10(Console con){
		con.println("TEMP - Scene 10");
		con.println("Before you go, the cube wants to give you a treat.");
		con.println("It conjures 10 cookies.");
		con.println("Carefully choose a number.");
		con.println("TEMP - visual clue in the background that says the cube only likes integers");
	}
	// SCENE 11
	public static void scene11(Console con){
		con.println("TEMP - Scene 11");
	}
	// SCENE 12
	public static void scene12(Console con){
		con.println("TEMP - Scene 12");
	}
	// SCENE 13
	public static void scene13(Console con){
		con.println("TEMP - Scene 13fg m, njp97");
	}

	
}
