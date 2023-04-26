// Story Name: Escape the Dark Dimension
// Programmer Name: Erin Hu
// Version Number: ??


// to do
/* Fix graphics for scene 1, 2
 * Animation for scene 1
 * Scene 2 - add white graphics box for guesses
 * Delete extra set fonts
 * good job, keep going, etc for swimming scene
 * indicate what number to enter
 * */

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class midterm{
	public static void main(String[] args){
		// Console
		Console con = new Console("Escape the Dark Dimension", 1280, 720);
		// Scene 1 Variables
		String strChoice; 
		strChoice = "";
		// Scene 2 Variables
		int intGuess;
		int intRand;
		int intCount;
		// Scene 3 Variables
		String strTired;
		int intLength2;
		int intCount3;
		double dblSwim;
		dblSwim = 0;
		double dblSwim2;
		// NOTE: The scenes have numerical labels. 
		// NOTE: However, the scenes here are listed chronologically, based on how the story flows.
		// Scene 8 Variables
		String strName;
		String strLetter;
		int intCount2;
		int intLength;
		int intCheck;
		intCheck = 0;
		// Scene 10 Variables
		int intCookies;
		// Scene 4 Variables
		double dblHyp;
		// Scene 5 Variables
		char charFood;
		// Font Variable
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 25);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		// Scene 1
		scene1(con);
		con.println("   Do you \"give up\" or \"keep swimming\"?");
		con.println("   Enter your choice exactly as shown.");
		strChoice = con.readLine();
		if(strChoice.equalsIgnoreCase("give up")){
			// Scene 2
			con.clear();
			scene2(con);
			con.println("   You will enter a number between 1 and 3");
			con.println("   inclusive to see if you can open it. ");
			con.println("   You get 10 attempts.");
			for(intCount = 1; intCount <= 10; intCount++){
				intRand = (int)(Math.random() * 4 + 1);
				con.println("   Guess "+intCount+":");
				intGuess = con.readInt();
				if(intGuess == intRand){
					intCount = 11;
					con.clear();
					// Scene 8
					scene8(con);
					con.println("   Enter your name carefully: ");
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
						// Scene 9
						con.clear();
						scene9(con);
					}else{
						// Scene 10
						con.clear();
						scene10(con);
						con.println("How many cookies do you take?");
						intCookies = con.readInt();
						if(intCookies == 10 || intCookies == 0){
							con.clear();
							// Scene 9 (There are two possible outcomes that lead to Scene 9)
							scene9(con);
						}else if(intCookies >= 1 && intCookies <= 9){
							con.clear();
							// Scene 11
							scene11(con);
						}
					}
				}else if(intGuess != intRand && intCount == 10){
					intCount = 11;
					// Scene 7
					con.clear();
					scene7(con);
				}
			}
		}else if(strChoice.equalsIgnoreCase("keep swimming")){
			con.clear();
			// Scene 3
			scene3(con);
			con.println("   How tired are you right now?");
			con.println("   Answer with a phrase.");
			strTired = con.readLine();
			intLength2 = strTired.length(); 
			for(intCount3 = intLength2; intCount3 > 0; intCount3--){
				con.println("   Enter any double number to keep swimming: ");
				dblSwim2 = con.readDouble();
				dblSwim = dblSwim + dblSwim2;
				// con.println("TEMP"+dblSwim);
				if(dblSwim < 10){
					con.println("   You're sinking!");
				}else if(dblSwim >= 10 && dblSwim < 50){
					con.println("   Keep going! Almost there!");
				}else if(dblSwim >= 50 && dblSwim < 99){
					con.println("   So close!");
				}else{
					intCount3 = 0;
				}
			}
			if(dblSwim < 100){
				// Scene 7
				con.clear();
				scene7(con);
			}else{   
				con.clear();
				// Scene 4
				scene4(con);
				con.println("   Enter the hypotenuse: ");
				dblHyp = con.readDouble();
				if(dblHyp == 10){
					// con.println("test");
					// Scene 5
					con.clear();
					scene5(con);
					charFood = con.getChar();
					// con.println(charFood);
					if(charFood > 'g'){
						// Scene 12
						con.clear();
						scene12(con);
					}else if(charFood <= 'g'){
						// Scene 13
						con.clear();
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
		// Images
		BufferedImage imgScene1Background = con.loadImage("Scene1-1.jpg");
		BufferedImage imgScene1Character = con.loadImage("Scene1-3.jpeg");
		// Variables
		int intCount1;
		int intCount8; // intCount2 to intCount 7 are used for other scenes
		int intCharacterY;
		intCharacterY = 25;
		// Text 
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("   You woke up to find yourself drowning in an unknown liquid.");
		con.println("   It is very sticky and dense.");
		// Background
		con.drawImage(imgScene1Background,0,0);
		// Animation loops
		for(intCount8 = 0; intCount8 <= 3; intCount8++){
			for(intCount1 = 0; intCount1 <= 27; intCount1++){
				con.drawImage(imgScene1Background,0,0);
				con.drawImage(imgScene1Character,0,intCharacterY);
				con.repaint();
				con.sleep(15);
				intCharacterY = intCharacterY - 2;
			}
			for(intCount1 = 0; intCount1 <= 27; intCount1++){
				con.drawImage(imgScene1Background,0,0);
				con.drawImage(imgScene1Character,0,intCharacterY);
				con.repaint();
				con.sleep(15);
				intCharacterY = intCharacterY + 2;
			}
		}	
	}
	// SCENE 2
	public static void scene2(Console con){
		// Variables
		BufferedImage imgScene2Character = con.loadImage("Scene2-1.jpg");
		BufferedImage imgScene2Background = con.loadImage("Scene2-2.jpg");
		int intCount2;
		int intCount3;
		int intBubbleY;
		intBubbleY = 0;
		int intBubbleY2;
		intBubbleY2 = -80;
		int intBubbleY3;
		intBubbleY3 = -50;
		// Background
		con.drawImage(imgScene2Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("   You sink, then find a button with a sliding");
		con.println("   door.");
		// Animation: person sinking
		for(intCount3 = 0; intCount3 < 400; intCount3 = intCount3 + 8){
			// Background
			con.drawImage(imgScene2Background, 0, 0);
			// Character
			con.drawImage(imgScene2Character, 150, intCount3);
			// Bubbles and custom RGB colour
			con.setDrawColor(new Color(247, 175, 120));
			con.fillOval(700, intBubbleY, 25, 25);
			con.setDrawColor(new Color(237, 170, 130));
			con.fillOval(750, intBubbleY2, 35, 35);
			con.setDrawColor(new Color(227, 180, 136));
			con.fillOval(800, intBubbleY3, 28, 28);
			// Repaint
			con.repaint();
			con.sleep(33);
			intBubbleY = intBubbleY + 8;
			intBubbleY2 = intBubbleY2 + 8;
			intBubbleY3 = intBubbleY3 + 8;
		}
	}	
	// SCENE 3
	public static void scene3(Console con){
		// Variables
		BufferedImage imgScene3Background = con.loadImage("Scene3-1.jpg");
		BufferedImage imgScene3Character = con.loadImage("Scene3-2.jpg");
		// Images
		con.drawImage(imgScene3Background,0,0);
		con.drawImage(imgScene3Character,0,0);
		// Text
		con.println("  ");
		con.println("   You are getting very tired. Can you swim out?");
	}
	// SCENE 4
	public static void scene4(Console con){
		// Variables
		char chrRead;
		int intCount4;
		int intCount5;
		int intCount6;
		int intEyebrowsY;
		intEyebrowsY = 0;
		BufferedImage imgScene4Background = con.loadImage("Scene4-1.jpg");
		BufferedImage imgScene4Eyebrows = con.loadImage("Scene4-2.jpg");
		// Images
		con.drawImage(imgScene4Background, 0, 0);
		con.drawImage(imgScene4Eyebrows, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println("   Your swim to the shore has made you hungry.");
		con.println("   A suspicious, carnivorous cube sits on a fridge.");
		con.println("   The cube says that you can open the fridge if");
		con.println("   you find the hypotenuse of a triangle with side");
		con.println("   lengths 6 and 8. ");
		// Animation
		for(intCount6 = 0; intCount6 <= 4; intCount6++){
			for(intCount4 = 0; intCount4 <= 10; intCount4++){
				con.drawImage(imgScene4Background, 0, 0);
				con.drawImage(imgScene4Eyebrows, 0, intEyebrowsY);
				con.repaint();
				con.sleep(33);
				intEyebrowsY = intEyebrowsY + 5;
				if(intEyebrowsY == 50){
					for(intCount5 = 0; intCount5 <= 10; intCount5++){
						con.drawImage(imgScene4Background, 0, 0);
						con.drawImage(imgScene4Eyebrows, 0, intEyebrowsY);
						con.repaint();
						con.sleep(33);
						intEyebrowsY = intEyebrowsY - 5;
					}
				}
			}
		}
	}
	// SCENE 5
	public static void scene5(Console con){
		// Variables
		BufferedImage imgScene5Background = con.loadImage("Scene5-1.jpg");
		// Image
		con.drawImage(imgScene5Background, 0, 0);
		// Text
		con.println("  ");
		con.println("   Since you opened the fridge, you stuff yourself with food.");
		con.println("   The cube asks you how the food was. Press any letter key");
		con.println("   to respond to the cube.");
	}
	// SCENE 6
	public static void scene6(Console con){
		// Variables
		int intCount6;
		int intCount7;
		intCount7 = 0;
		int intMouthY;
		intMouthY = 0;
		BufferedImage imgScene13Background = con.loadImage("Scene13-1.jpg");
		BufferedImage imgScene13Mouth = con.loadImage("Scene13-2.jpg");
		// Images
		con.drawImage(imgScene13Background, 0, 0);
		con.drawImage(imgScene13Mouth, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println("  ");
		con.println("   The cube was hoping you could open the fridge,");
		con.println("   but you did not get the correct answer. The cube");
		con.println("   is hungry too, so it eats you. Game over.");
		// Animation
		while(intCount7 == 0){
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY - 2;
			}
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY + 2;
			}
		}
	}
	// SCENE 7
	public static void scene7(Console con){
		// Image and image variable
		BufferedImage imgScene7Background = con.loadImage("Scene7-1.jpg");
		con.drawImage(imgScene7Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("All this swimming has tired you out.");
		con.println("You run out of air and energy. Your consciousness slowly");
		con.println("slips away as you fight to survive. A fish eats you, and");
		con.println("you die. Game over.");
	}
	// SCENE 8
	public static void scene8(Console con){
		// Images
		BufferedImage imgScene8Background = con.loadImage("Scene8-1.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println("  ");
		con.println(" ");
		con.println("    You open the door and quickly go in. A giant cube asks");
		con.println("    what your name is. It tells you to enter by only using");
		con.println("    five specific letters There are only five of these.");
		con.println("    They have unique sounds. Some people consider \"y\"");
		con.println("    one of these, but today, \"y\" is the other category.");
	}
	// SCENE 9
	public static void scene9(Console con){
		// Images
		BufferedImage imgScene8Background = con.loadImage("Scene9.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("    The cube is mad. It eats you.");
		con.println("    Unfortunately, you will never see your home");
		con.println("    again. Game over.");
	}
	// SCENE 10
	public static void scene10(Console con){
		// Images
		BufferedImage imgScene10Background = con.loadImage("Scene10-1.jpg");
		con.drawImage(imgScene10Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("      Before you go, the cube wants to give you a treat.");
		con.println("      It conjures 10 cookies. The cube asks, \"How many ");
		con.println("      do you want?\" Choose carefully because the cube has");
		con.println("      has a short temper.");
	}
	// SCENE 11
	public static void scene11(Console con){
		// Images
		BufferedImage imgScene10Background = con.loadImage("Scene11.jpg");
		con.drawImage(imgScene10Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("    The cube decides that it is pleased with you. You");
		con.println("    survive. The cube transports you through a portal");
		con.println("    back to your home.");
	}
	// SCENE 12
	public static void scene12(Console con){
		// Images
		BufferedImage imgScene8Background = con.loadImage("Scene12.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("   The cube is happy. It lets you live, then transports");
		con.println("   you back home.");
	}
	// SCENE 13
	public static void scene13(Console con){
		// Variables
		int intCount6;
		int intCount7;
		intCount7 = 0;
		int intMouthY;
		intMouthY = 0;
		BufferedImage imgScene13Background = con.loadImage("Scene13-1.jpg");
		BufferedImage imgScene13Mouth = con.loadImage("Scene13-2.jpg");
		// Images
		con.drawImage(imgScene13Background, 0, 0);
		con.drawImage(imgScene13Mouth, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println("The cube is offended. It eats you. Game over.");
		// Animation
		while(intCount7 == 0){
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY - 2;
			}
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY + 2;
			}
		}
	}
}
