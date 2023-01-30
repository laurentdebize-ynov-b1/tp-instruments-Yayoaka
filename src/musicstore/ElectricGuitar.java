package musicstore;

public class ElectricGuitar extends StringInstrument {
	private String micro;
	
	public ElectricGuitar(String micro, int nbcorde, String typebois, String tuneType, String brand, String model, float price, boolean state) {
		super(nbcorde, typebois, tuneType, brand, model, price, state);
		this.micro = micro;
	}
	
	public String getMicro() {
		return this.micro;
	}
	
	public String toString() {
	return "guitar " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate;
	}
	
}
