package musicstore;

public class DrumsInstrument extends Instrument {
	private boolean bismounted;
	
	public DrumsInstrument(boolean bismounted, String brand, String model, float price, boolean state) {
		super(brand, model, price, state);
		this.bismounted = bismounted;
		
	}
}
