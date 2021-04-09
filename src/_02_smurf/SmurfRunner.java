package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf smurfs = new Smurf("Handy");
		smurfs.eat();
		smurfs.getName();
		Smurf PapaSmurf = new Smurf("Papa");
		PapaSmurf.getHatColor();
		PapaSmurf.eat();
		System.out.println( PapaSmurf.getHatColor() );
		Smurf Smurfette = new Smurf("Smurfette");
		Smurfette.eat();
		Smurfette.isGirlOrBoy();
		System.out.println(Smurfette.isGirlOrBoy());
	}
}
