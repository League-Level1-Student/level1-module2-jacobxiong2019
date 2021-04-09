package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature seaCreature = new SeaCreature("spongebob");
		seaCreature.eat();
		seaCreature.laugh();
		SeaCreature seaCreature1 = new SeaCreature("Patrick");
		seaCreature1.getName();
		seaCreature1.eat();
		seaCreature1.laugh();
		SeaCreature seaCreature2 = new SeaCreature("squidward");
		seaCreature2.getName();
		seaCreature2.eat();
		seaCreature2.laugh();
	}
		
}
