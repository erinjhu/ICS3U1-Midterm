import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester10{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene10(con);
	}
	public static void scene10(Console con){
		// Background
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 25);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		BufferedImage imgScene10Background = con.loadImage("Scene10-1.jpg");
		con.drawImage(imgScene10Background, 0, 0);
		con.setTextColor(Color.BLACK);
		con.println("**TEMP - Scene 8");
		con.println(" ");
		con.println("      Before you go, the cube wants to give you a treat.");
		con.println("      It conjures 10 cookies. The cube asks, \"How many ");
		con.println("      do you want?\" Choose carefully because the cube has");
		con.println("      has a short temper.");
	}
}
