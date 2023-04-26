import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester2{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 25);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		scene13(con);
	}
	public static void scene13(Console con){
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
		con.println("   You sink, then find a button with a sliding door.");
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
}
