package at.fhj.iit;

/*
 * Konfig_B20_Causevic
 * Author: Alen Causevic
 */

public class AlcoholicDrinks extends Drink {

	protected Liquid l;

	public AlcoholicDrinks(String name, Liquid l) {
		super(name);
		this.l = l;
	}

	@Override
	public double getVolume() {
		return l.getVolume();
	}

	@Override
	public double getAlcoholPercent() {
		return l.getAlcoholPercent();
	}

	@Override
	public boolean isAlcoholic() {
		if (l.getAlcoholPercent() > 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "- Alcoholic drink: " + name + "\n" + 
			   "- Alcohol-percent: " + l.getAlcoholPercent()+"% \n" +
				"- Volume:   " + l.getVolume() + "l \n";
	}
}
