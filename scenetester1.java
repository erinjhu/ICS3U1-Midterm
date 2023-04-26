import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester1{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene13(con);
	}
	public static void scene13(Console con){
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
		for(intCount8 = 0; intCount8 <= 5; intCount8++){
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
}
