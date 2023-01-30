package musicstore;

public class Violin extends StringInstrument {
	private String woodenBow;
	
	public Violin(String woodenBow, int nbStrings, String woodType, String tuneType, int id, String brand, String model, float price, boolean state) {
		super(nbStrings, woodType, tuneType, id, brand, model, price, state);
		this.woodenBow = woodenBow;
	}
	
	public String getWoodenBow() {
		return this.woodenBow;
	}
	
	public void setWoodenBow(String bow) {
		this.woodenBow = bow;
	}
	
	
	public String toString() {
	return "violon id " + this.id + " ,brand : " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate;
	}
	
}
