package musicstore;

public class KeyboardInstrument extends Instrument{
	private int nbTouches;
	
	public KeyboardInstrument(int nbTouches, String brand, String model, float price, boolean state) {
		super(brand, model, price, state);
		this.nbTouches = nbTouches;

	}
	
	public int getNbTouches() {
		return this.nbTouches;
	}
}
