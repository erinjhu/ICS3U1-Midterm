import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester7{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene7(con);
	}
	public static void scene7(Console con){
		// Background
		BufferedImage imgScene7Background = con.loadImage("Scene7-1.jpg");
		con.drawImage(imgScene7Background, 0, 0);
		con.setTextColor(Color.BLACK);
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		con.println("TEMP - Scene 7");
		con.println(" ");
		con.println("All this swimming has tired you out.");
		con.println("You run out of air and energy. Your consciousness slowly");
		con.println("slips away as you fight to survive. A fish eats you, and");
		con.println("you die. Game over.");
	}
}
