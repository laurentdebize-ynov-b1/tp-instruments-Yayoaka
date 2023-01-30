package musicstore;

import java.util.Scanner;

public class ElectricGuitar extends StringInstrument {
	private String micro;
	
	public ElectricGuitar(String micro, int nbStrings, String woodType, String tuneType,int id , String brand, String model, float price, boolean state) {
		super(nbStrings, woodType, tuneType, id, brand, model, price, state);
		this.micro = micro;
	}
	
	public String getMicro() {
		return this.micro;
	}
	
	public String toString() {
	return "guitar id " + this.id + " ,brand : " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate;
	}
	
	public void initialize() {
		Scanner input = new Scanner(System.in);
		System.out.print("ID : ");
		this.id = input.nextInt();
		input.nextLine();

		System.out.print("Brand : ");
		this.brand = input.nextLine();

		System.out.print("Model : ");
		this.model = input.nextLine();

		System.out.print("Price : ");
		this.price = input.nextFloat();
		

	}

	
}
