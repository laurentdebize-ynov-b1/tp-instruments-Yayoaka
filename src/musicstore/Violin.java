package musicstore;

public class Violin extends StringInstrument {
	private String archetBois;
	
	public Violin(String archetBois, int nbcorde, String typebois, String tuneType, String brand, String model, float price, boolean state) {
		super(nbcorde, typebois, tuneType, brand, model, price, state);
		this.archetBois = archetBois;
	}
	
	public String getArchetBois() {
		return this.archetBois;
	}
	
	public String toString() {
	return "violon " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate;
	}
	
}
