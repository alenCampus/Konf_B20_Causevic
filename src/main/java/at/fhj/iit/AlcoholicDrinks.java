package at.fhj.iit;

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
		return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
	}
}
