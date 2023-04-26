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
		// Images
		BufferedImage imgScene8Background = con.loadImage("Scene12.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		// Text
		con.setTextColor(Color.BLACK);
		con.println(" ");
		con.println(" ");
		con.println("   The cube is happy. It lets you live, then transports");
		con.println("   you back home.");
	}
}
