import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester6{
	public static void main(String[] args){
		// PUT
		Console con = new Console(1280,720);
		scene6(con);
	}
	public static void scene6(Console con){
		// Variables
		int intCount6;
		int intCount7;
		intCount7 = 0;
		int intMouthY;
		intMouthY = 0;
		BufferedImage imgScene13Background = con.loadImage("Scene13-1.jpg");
		con.drawImage(imgScene13Background, 0, 0);
		BufferedImage imgScene13Mouth = con.loadImage("Scene13-2.jpg");
		con.drawImage(imgScene13Mouth, 0, 0);
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		con.println("  ");
		con.println("   The cube was hoping you could open the fridge,");
		con.println("   but you did not get the correct answer. The cube");
		con.println("   is hungry too, so it eats you. Game over.");
		while(intCount7 == 0){
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY - 2;
			}
			for(intCount6 = 0; intCount6 <= 33; intCount6++){
				con.drawImage(imgScene13Background, 0, 0);
				con.drawImage(imgScene13Mouth, 0, intMouthY);
				con.repaint();
				con.sleep(15);
				intMouthY = intMouthY + 2;
			}
		}
	}

}
