import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene8(con);
	}
	public static void scene8(Console con){
		// Background
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setDrawFont(fntJosefin);
		BufferedImage imgScene8Background = con.loadImage("Scene8-1.jpg");
		con.drawImage(imgScene8Background, 0, 0);
		con.setTextColor(Color.BLACK);
		con.println("TEMP - Scene 8");
		con.println("FONT NOT CHANGING FOR SOME REASON..");
		con.println("    You open the door and quickly go in. A giant cube asks");
		con.println("    you, \"whAt Is yOUr nAmE?\" The cube is very picky.");
		con.println("    It then says, \"lIstEn cArEfUlly. bE AwArE Of ");
		con.println("    yOUr sUrrOUndIngs.");
	}
}
