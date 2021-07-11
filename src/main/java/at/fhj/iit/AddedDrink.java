package at.fhj.iit;

/*
 * Konf_B20_Causevic
 * Author : Alen Causevic
 */
public class AddedDrink extends Drink {

	protected double volume;
	protected double alcoholPercent;

	// -- Constructor --
	public AddedDrink(String name, double volume, double alcoholPercent) {
		super(name);
		this.volume = volume;
		this.alcoholPercent = alcoholPercent;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public double getAlcoholPercent() {

		return alcoholPercent;
	}

	@Override
	public boolean isAlcoholic() {
		if (alcoholPercent > 0) {
			return true;
		}
		return false;
	}

}
