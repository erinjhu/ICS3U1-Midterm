// save to separate folder 

import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class NickAdventure{
	public static void main(String[] args){
		Console con = new Console("Nick's excellent adventure", 1280, 720);
		String strChoice;
		int intX;
		con.setTextColor(Color.BLACK);
		//con.println("TEMP - Scene 1 - Nick is studying for a functions test");
		scene1(con);
		con.println("Does Nick \"play\" games or does he \"study\" more?");
		strChoice = con.readLine();
		if(strChoice.equals("play")){
			//con.println("TEMP - Scene 2 - Nick plays, smells, and dies");
			con.clear();
			scene2(con);
		}else if(strChoice.equals("study")){
			con.println("TEMP - Scene 3 - math question");
			con.println("Enter the value of x");
			intX = con.readInt();
			if(intX == -3){
				con.println("TEMP - Scene 5 - gets the answer right");
			}else{
				con.println("TEMP - Scene 3 - mocked for silly answer");
			}
		}
	}
	public static void scene1(Console con){
		BufferedImage imgScene1 = con.loadImage("scene1.jpg");
		con.drawImage(imgScene1, 0, 0);
		con.println("It is late at night and Nick is studying for his functions test");
		con.repaint();
	}
	public static void scene2(Console con){
		BufferedImage imgScene2 = con.loadImage("scene2.jpg");
		con.println("Nick does not take care of himself for hours, smells, and dies");
		int intCount;
		int intCount2;
		for(intCount2 = 0; intCount2 < 3; intCount2++){
			for(intCount = 400; intCount > 0; intCount = intCount - 8){
				con.drawImage(imgScene2, 0, 0);
				con.setDrawColor(Color.RED);
				con.drawString("stink nasty", 550, intCount);
				con.repaint();
				// 30 fps = 1000ms/30 = 33 ms about
				con.sleep(33);
			}
		}		
	}
}
		
		
