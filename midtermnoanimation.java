// Story Name: Escape the Dark Dimension
// Programmer Name: Erin Hu
// Version Number: ??

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midtermnoanimation{
	public static void main(String[] args){
		// Console
		Console con = new Console("Escape the Dark Dimension", 1280, 720);
		con.setBackgroundColor(Color.WHITE);
		con.setTextColor(Color.BLACK); // could set to custom rgb colour
		con.println("TEMP - Scene 0");
		// SCENE 1 VARIABLES
		String strChoice; 
		strChoice = "";
		// SCENE 2 VARIABLES
		int intGuess;
		int intRand;
		int intCount;
		// SCENE 3 VARIABLES
		String strTired;
		int intLength2;
		int intCount3;
		double dblSwim;
		dblSwim = 0;
		double dblSwim2;
		// SCENE 8 VARIABLES
		String strName;
		String strLetter;
		int intCount2;
		int intLength;
		int intCheck;
		intCheck = 0;
		// SCENE 10 VARIABLES
		int intCookies;
		// SCENE 4 VARIABLES
		double dblHyp;
		char charFood;
		// SCENE 1 - CHOICE
		scene1(con);
		con.println("Do you \"give up\" or \"keep swimming\"?");
		strChoice = con.readLine();
		if(strChoice.equalsIgnoreCase("give up")){
			// SCENE 2 - CHOICE
			con.clear();
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
						// con.println("TEMP - not all vowels");
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
			// SCENE 3 - CHOICE
			scene3(con);
			con.println("How tired are you right now?");
			strTired = con.readLine();
			intLength2 = strTired.length(); // not included on flowchart, but at the same time it's not a choice
			for(intCount3 = intLength2; intCount3 > 0; intCount3--){
				con.println("Enter any double number to keep swimming: ");
				dblSwim2 = con.readDouble();
				dblSwim = dblSwim + dblSwim2;
				con.println("TEMP"+dblSwim);
			}
			if(dblSwim < 100){
				con.clear();
				scene7(con);
			}else{   // put else if instead??
				con.clear();
				// SCENE 4 - CHOICE
				scene4(con);
				con.println("Enter the hypotenuse: ");
				dblHyp = con.readDouble();
				if(dblHyp == 10){
					// con.println("test");
					con.clear();
					// SCENE 5 - CHOICE
					scene5(con);
					// entered food choice
					charFood = con.readChar();
					con.println(charFood);
					if(charFood > 'g'){
						con.clear();
						// SCENE 12
						scene12(con);
					}else if(charFood <= 'g'){
						con.clear();
						// SCENE 13
						scene13(con);
					}
				}else{
					// con.println("test wrong");
				}
			}
		}
	}
	// SCENE 1
	public static void scene1(Console con){
		con.println("You woke up to find yourself drowning in an unknown liquid.");
		con.println("It is very sticky and dense.");
		BufferedImage imgScene1 = con.loadImage("scene1.jpg");
		con.drawImage(imgScene1, 0, 0);
		con.println("It is late at night and Nick is studying for his functions test");
		con.repaint();
		
	}
	// SCENE 2
	public static void scene2(Console con){
		BufferedImage imgScene2 = con.loadImage("scene2.jpg");
		con.println("Nick does not take care of himself for hours, smells, and dies");
		int intCount;
		int intCount2;
		for(intCount2 = 0; intCount2 < 3; intCount2++){
			for(intCount = 400; intCount > 0; intCount = intCount - 8){
				con.drawImage(imgScene2, 0, 0);
				con.setDrawColor(Color.RED);
				con.drawString("stink nasty", 550, intCount);
				con.repaint();
				// 30 fps = 1000ms/30 = 33 ms about
				con.sleep(33);
			}
		}	
	}
	// SCENE 3
	public static void scene3(Console con){
		con.println("TEMP - Scene 3");
		con.println("You are getting very tired. Can you swim out?");
	}
	// SCENE 4
	public static void scene4(Console con){
		con.println("TEMP - Scene 4");
		con.println("Your swim to the shore has made you hungry.");
		con.println("A suspicious, carnivorous cube sits on a fridge.");
		con.println("TEMP: image layer: the cube says that you can open the fridge if you find the hyp of triangle 6 and 8");
	}
	// SCENE 5
	public static void scene5(Console con){
		con.println("TEMP - Scene 5");
		con.println("Since you opened the fridge, you stuff yourself with food.");
		con.println("TEMP - image layer - the cube asks you how the food was. enter the first letter");
		con.println("TEMP - enter \"g\" for \"good\"");
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
		con.println("You did not pay attention to your surroundings.");
		con.println("The cube is mad. It eats you.");
		con.println("Unfortunately, you will never see your home again. Game over");
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
		con.println("The cube decides it likes you. You survive.");
		con.println("The cube transports you through a portal back to your home.");
	}
	// SCENE 12
	public static void scene12(Console con){
		con.println("TEMP - Scene 12");
		con.println("The cube is happy. It lets you live, then transports you back home.");
	}
	// SCENE 13
	public static void scene13(Console con){
		con.println("TEMP - Scene 13");
		con.println("You offended the cube. It eats you. Game over.");
	}

	
}
