import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class midterm{
	public static void main(String[] args){
		// Console
		Console con = new Console("Escape the Dark Dimension", 1280, 720);
		con.setBackgroundColor(Color.WHITE);
		con.setTextColor(Color.BLACK); // could set to custom rgb colour
		con.println("TEMP - Scene 0");
		// Variables
		String strChoice; // ok if random order?
		int intGuess;
		String strName;
		int intCookies;
		double dblSwim;
		double dblHyp;
		char charFood;
		// Scene
		scene1(con);
		con.println("Do you \"give up\" or \"keep swimming\"?");
		strChoice = con.readLine();
		if(strChoice.equalsIgnoreCase("give up")){
			con.clear();
			scene2(con);
		}else if(strChoice.equalsIgnoreCase("keep swimming")){
			con.clear();
			scene3(con);
		}
	}
	// SCENE 1
	public static void scene1(Console con){
		BufferedImage imgScene1 = con.loadImage("Scene1.jpeg");
		con.drawImage(imgScene1, 0, 0);
		con.println("TEMP - Scene 1");
		con.println("You woke up to find yourself drowning in an unknown liquid.");
		con.println("It is very sticky and dense.");
	}
	// SCENE 2
	public static void scene2(Console con){
		con.println("TEMP - Scene 2");
	}
	// SCENE 3
	public static void scene3(Console con){
		con.println("TEMP - Scene 3");
	}
	// SCENE 4
	public static void scene4(Console con){
		con.println("TEMP - Scene 4");
	}
	// SCENE 5
	public static void scene5(Console con){
		con.println("TEMP - Scene 5");
	}
	// SCENE 6
	public static void scene6(Console con){
		con.println("TEMP - Scene 6");
	}
	// SCENE 7
	public static void scene7(Console con){
		con.println("TEMP - Scene 7");
	}
	// SCENE 8
	public static void scene8(Console con){
		con.println("TEMP - Scene 8");
	}
	// SCENE 9
	public static void scene9(Console con){
		con.println("TEMP - Scene 9");
	}
	// SCENE 10
	public static void scene10(Console con){
		con.println("TEMP - Scene 10");
	}
	// SCENE 11
	public static void scene11(Console con){
		con.println("TEMP - Scene 11");
	}
	// SCENE 12
	public static void scene12(Console con){
		con.println("TEMP - Scene 12");
	}
	// SCENE 13
	public static void scene13(Console con){
		con.println("TEMP - Scene 13fg m, njp97");
	}

	
}
