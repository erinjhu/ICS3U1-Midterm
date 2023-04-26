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
		// Images
		BufferedImage imgScene8Background = con.loadImage("Scene8-1.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println("    You open the door and quickly go in. A giant cube asks");
		con.println("    what your name is. It tells you to enter by only using");
		con.println("    five specific letters There are only five of these.");
		con.println("    They have unique sounds. Some people consider \"y\"");
		con.println("    one of these, but today, \"y\" is the other category.");
	}
}
