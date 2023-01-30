package musicstore;

public class BassPad extends ElectronicDrums{
	private int diameter;
	private String matter;
	
	public BassPad(int diameter, String matter, boolean bIsConnected ,boolean bismounted, String brand, String model, float price, boolean state) { 
		super(bIsConnected ,bismounted, brand, model, price, state);
		this.diameter = diameter;
		this.matter = matter;
	}
	
	public void produceSound() {
		System.out.println("POUM");
	}
}
