import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midtermtest{
	public static void main(String[] args){
		Console con = new Console("Escape the Dark Dimension", 1280, 720);
		scene1(con);
	}
	public static void scene1(Console con){
		// Image variables
		BufferedImage imgScene1Background = con.loadImage("Scene1-1.jpeg");
		BufferedImage imgScene1Part2 = con.loadImage("Scene1-2.jpeg");
		BufferedImage imgScene1Character = con.loadImage("Scene1-3.jpeg");
		// Loop variables
		int intStart;
		intStart = 50;
		// Animation variables
		int intCharacterY;
		intCharacterY = -100;
		// Text colour
		con.setTextColor(Color.WHITE);
		// Text
		con.println("You woke up to find yourself drowning in an unknown liquid.");
		con.println("It is very sticky and dense.");
		// Background
		con.drawImage(imgScene1Background,0,0);
		con.repaint();
		con.println("test");
		// Animation loop
		while(intStart > 0){
			// Character
			con.drawImage(imgScene1Character,0,intCharacterY);
			con.repaint();
			con.sleep(100);
			// If statements to move character
			if(intCharacterY == -100){
				intCharacterY = intCharacterY + 50;
			}else if(intCharacterY == -50){
				intCharacterY = intCharacterY - 50;
			}
			intStart = intStart - 1;
			con.repaint();
		}
	}
}

	
