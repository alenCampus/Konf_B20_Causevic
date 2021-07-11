package at.fhj.iit;

public class Main {

	public static void main(String[] args) {

		Liquid l = new Liquid("Wein", 0.125, 13);
		System.out.println(l.getName());
		System.out.println(l.getVolume());

		Drink d = new SimpleDrink("Rotwein", l);
		System.out.println(d);
		separatorLineTitle(50);

		System.out.println("New flavours");
		System.out.println();

		AddedDrink mango = new AddedDrink("Mango", 0.2, 0);
		System.out.println("Falvour: " + mango.name);
		System.out.println("Volume: " + mango.getVolume() + "l");
		System.out.println("Alcohol: " + mango.getAlcoholPercent() + "%");
		System.out.println("Alcoholic: " + mango.isAlcoholic());

		separatorLine();
		AddedDrink redAce = new AddedDrink("Red Ace", 0.75, 0);
		System.out.println("Flavour: " + redAce.name);
		System.out.println("Volume: " + redAce.getVolume() + "l");
		System.out.println("Alcohol: " + redAce.getAlcoholPercent() + "%");
		System.out.println("Alcoholic: " + redAce.isAlcoholic());

		separatorLineTitle(50);
		System.out.println("Alcolic Drinks");

	}

	public static void separatorLine() {
		System.out.println("-".repeat(15));
	}

	public static void separatorLineTitle(int amount) {
		System.out.println("-".repeat(amount));
	}
}
