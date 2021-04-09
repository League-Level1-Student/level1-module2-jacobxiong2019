package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class tea_makerRunner {
	public static void main(String[] args) {
		TeaBag tea = new TeaBag("green");
		
		Kettle kettle = new Kettle();
		kettle.getWater();
		Water water = kettle.getWater();
		kettle.boil();
		
		Cup cup = new Cup();
		cup.makeTea(tea, water);
			
	}
}
