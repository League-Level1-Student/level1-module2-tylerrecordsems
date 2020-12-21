package _02_smurf;

public class smurf_Run {
public static void main(String[] args) {
	Smurf mma = new Smurf("Rowdy roody Piper");
	Smurf PAPA = new Smurf ("Smurft=papa");
Smurf Smurfette = new Smurf ("I can fly");
System.out.println(mma.getName());
mma.Home();
mma.KO();
mma.eat();
	System.out.println(	PAPA.getName());
	System.out.println(PAPA.getHatColor());
	System.out.println(PAPA.isGirlOrBoy());
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(	Smurfette.isGirlOrBoy());
	System.out.println(mma.getHatColor());
}
}
