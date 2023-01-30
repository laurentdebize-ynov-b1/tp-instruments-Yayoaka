package musicstore;

public class KeyboardInstrument extends Instrument{
	private int nbKeys;
	
	public KeyboardInstrument(int nbKeys, String brand, String model, float price, boolean state) {
		super(brand, model, price, state);
		this.nbKeys = nbKeys;

	}
	
	public int getNbKeys() {
		return this.nbKeys;
	}
}
