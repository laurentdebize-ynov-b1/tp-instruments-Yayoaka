package musicstore;

import java.util.ArrayList;

public class ElectronicCollection {
	private ArrayList<Object> listDrums;
	
	public ElectronicCollection() {
		listDrums = new ArrayList<Object>();
	}
	  
	public void addPercussion(Object drum) {
		listDrums.add(drum);
	}
	  
	public void removePercussion(Object drum) {
		listDrums.remove(drum);
	}
	  
	public ArrayList<Object> getDrums() {
	    return listDrums;
	}
}
