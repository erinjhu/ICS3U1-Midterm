import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester42{
	public static void main(String[] args){
		// PUT
		Console con = new Console(1280,720);
		scene4(con);
	}
	public static void scene4(Console con){
		// Background
		
		char chrRead;
		int intCount4;
		int intCount5;
		int intCount6;
		int intEyebrowsY;
		intEyebrowsY = 0;
		
		BufferedImage imgScene4Background = con.loadImage("Scene4-1.jpg");
		con.drawImage(imgScene4Background, 0, 0);
		BufferedImage imgScene4Eyebrows = con.loadImage("Scene4-2.jpg");
		con.drawImage(imgScene4Eyebrows, 0, 0);
		con.setTextColor(Color.BLACK);
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		con.println(" ");
		con.println("Your swim to the shore has made you hungry.");
		con.println("A suspicious, carnivorous cube sits on a fridge.");
		con.println("The cube says that you can open the fridge if");
		con.println("you find the hypotenuse of a triangle with side");
		con.println("lengths 6 and 8. Hurry because the cube is");
		con.println("impatient.");
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
		// getChar
		chrRead = '#';
		con.println("press any letter once to indicate you are done thinking");
		while(chrRead == '#'){
			con.println("The cube asks, \"Done yet?\"");
			chrRead = con.getChar();
		}
		con.println("done");
		
		}
	}

