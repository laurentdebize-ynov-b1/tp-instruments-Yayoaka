package musicstore;

import java.util.ArrayList;

public class ElectronicDrums extends DrumsInstrument implements Drums{
	private boolean bIsConnected;
	
	
	public ElectronicDrums(boolean bIsConnected ,boolean bismounted, String brand, String model, float price, boolean state) {
		super(bismounted, brand, model, price, state);
		this.bIsConnected = bIsConnected;
		
		BassPad bassPad1 = new BassPad();
		ArrayList<Object> listDrums = new ArrayList<Object>() ;
		//listDrums.addPercussion(bassPad1);
		
		listDrums.addPercussion((Object) 1800L);
        
        // Inserting Double value in arr
		listDrums.addPercussion(6.0D);
 
        //  Inserting Float value in arr
		listDrums.addPercussion(1.99F);
		
	}
	
	
	
	
	
	public String toString() {
	return "guitar " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate;
	}
	
    public static void display(ArrayList<Object> arr)
    {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
	
