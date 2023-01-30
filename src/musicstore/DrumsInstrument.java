package musicstore;

public class DrumsInstrument extends Instrument {
	private boolean bIsMounted;
	
	public DrumsInstrument(boolean bIsMounted, String brand, String model, float price, boolean state) {
		super(brand, model, price, state);
		this.bIsMounted = bIsMounted;
		
	}
	
	public boolean getBIsMounted() {
		return this.bIsMounted;
	}	
}
