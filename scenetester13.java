import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font; 

public class scenetester13{
	public static void main(String[] args){
		Console con = new Console(1280,720);
		scene13(con);
	}
	public static void scene13(Console con){
		// Background
		int intCount6;
		int intCount7;
		intCount7 = 0;
		int intMouthY;
		intMouthY = 0;
		BufferedImage imgScene13Background = con.loadImage("Scene13-1.jpg");
		con.drawImage(imgScene13Background, 0, 0);
		BufferedImage imgScene13Mouth = con.loadImage("Scene13-2.jpg");
		con.drawImage(imgScene13Mouth, 0, 0);
		con.setTextColor(Color.BLACK);
		Font fntJosefin = con.loadFont("JosefinSans-Regular.ttf", 30);  // (filename, fontsize)
		con.setTextFont(fntJosefin);
		con.println("TEMP - Scene 13 (change this into space)");
		con.println("The cube is offended. It eats you. Game over.");
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
