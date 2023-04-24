import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester11{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene10(con);
	}
	public static void scene10(Console con){
		// Background
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		BufferedImage imgScene10Background = con.loadImage("Scene11.jpg");
		con.drawImage(imgScene10Background, 0, 0);
		con.setTextColor(Color.BLACK);
		con.println("**TEMP - Scene 11");
		con.println(" ");
		con.println("    The cube decides that it is pleased with you. You");
		con.println("    survive. The cube transports you through a portal");
		con.println("    back to your home.");
	}
}
