package _03_tea_maker;

public class tea_run {
public static void main(String[] args) {
	
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	TeaBag bag = new TeaBag(TeaBag.MINT);
	kettle.getWater();
	kettle.boil();
	cup.makeTea(bag, kettle.getWater());

	
}
}
