package application;

import java.util.ArrayList;
import java.util.Random;

import javafx.scene.paint.Color;

public class DiamondColor {
protected  ArrayList<Color> tab; 
	
	public DiamondColor() {
		
		tab = new ArrayList<Color>();
		tab.add(Color.BLUE);
		tab.add(Color.BROWN);
		tab.add(Color.AQUAMARINE);
		tab.add(Color.BLUEVIOLET);
		tab.add(Color.DARKBLUE);
		tab.add(Color.DARKCYAN);
		tab.add(Color.CHOCOLATE);
	}
	public Color getColor()
	{
		//random choice of color 
		return tab.get(new Random().nextInt(tab.size()));
	}

}
