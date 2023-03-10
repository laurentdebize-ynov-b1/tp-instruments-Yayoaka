package musicstore;

public class Instrument {
	protected int id;
	protected String brand;
	protected String model;
	protected float price;
	protected boolean state;
	
	
	public Instrument(int id, String brand, String model, float price, boolean state) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.state = state;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public float setPrice(float price) {
		if (price < 0) {
			System.out.println("Le prix d'un instrument ne peut pas être négatif");
			return price;
		}
		return this.price = price;
	}
	
	public boolean getState() {
		return this.state;
	}
	

}
