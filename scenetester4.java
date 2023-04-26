import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester4{
	public static void main(String[] args){
		// PUT
		Console con = new Console(1280,720);
		scene4(con);
	}
	public static void scene4(Console con){
		// Variables
		char chrRead;
		int intCount4;
		int intCount5;
		int intCount6;
		int intCount9;
		int intEyebrowsY;
		int intMouthY;
		intEyebrowsY = 0;
		intMouthY = -50;
		BufferedImage imgScene4Background = con.loadImage("Scene4-1.jpg");
		BufferedImage imgScene4Eyebrows = con.loadImage("Scene4-2.jpg");
		BufferedImage imgScene4Mouth = con.loadImage("Scene4-3.jpg");
		// Images
		con.drawImage(imgScene4Background, 0, 0);
		con.drawImage(imgScene4Eyebrows, 0, 0);
		con.drawImage(imgScene4Mouth, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
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
				con.drawImage(imgScene4Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(33);
				intEyebrowsY = intEyebrowsY + 5;
				// Eyebrows move back up
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
}

