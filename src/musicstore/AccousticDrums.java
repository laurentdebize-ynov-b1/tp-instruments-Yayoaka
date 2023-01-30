package musicstore;

import java.util.ArrayList;

public class AccousticDrums extends DrumsInstrument implements Drums{
	private String typeDeco;
	ArrayList<Object> listDrums;
	
	public AccousticDrums(String typeDeco ,boolean bismounted, String brand, String model, float price, boolean state) {
		super(bismounted, brand, model, price, state);
		this.typeDeco = typeDeco;
		
		BassPad bassPad1 = new BassPad();
		listDrums = new ArrayList<Object>() ;
		//listDrums.addPercussion(bassPad1);
		
		listDrums.add((Object) 1800L);
        
        // Inserting Double value in arr
		listDrums.add(6.0D);
 
        //  Inserting Float value in arr
		listDrums.add(1.99F);
		
	}
	
	public String getTypeDeco() {
		return this.typeDeco;
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
