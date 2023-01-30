package musicstore;

import java.util.ArrayList;

public class ElectronicDrums extends DrumsInstrument implements Drums{
	private boolean bIsConnected;
//	ArrayList<Object> listDrums;
	ElectronicCollection listDrums;
	
	public ElectronicDrums(boolean bIsConnected ,boolean bismounted, String brand, String model, float price, boolean state) {
		super(bismounted, brand, model, price, state);
		this.bIsConnected = bIsConnected;
		
		ElectronicCollection listDrums = new ElectronicCollection();		
	}
	
	public addPercu(Drum element) {
		listDrums.addPercussion();
	}
	
	public boolean getBIsConnected() {
		return this.bIsConnected;
	}
	
	
	public String toString() {
	return "guitar " + this.brand +
			  " : model " + this.model;
	}
	
    public static void display(ArrayList<Object> arr)
    {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
