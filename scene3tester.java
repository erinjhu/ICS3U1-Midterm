import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scene3tester{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		int int1;
		scene7(con);
		con.println("?");
		int1 = con.readInt();
		if(int1 == 1){
			con.clear();
			scene3(con);
		}
	}
	public static void scene3(Console con){
		// Background
		BufferedImage imgScene3Background = con.loadImage("Scene3-1.jpg");
		con.drawImage(imgScene3Background,0,0);
		BufferedImage imgScene3Character = con.loadImage("Scene3-2.jpg");
		con.drawImage(imgScene3Character,0,0);
		con.println("TEMP - Scene 3");
		con.println(" ");
		con.println("You are getting very tired. Can you");
		con.println("swim out?");
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
