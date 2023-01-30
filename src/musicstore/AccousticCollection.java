package musicstore;

import java.util.ArrayList;

public class AccousticCollection {
	private ArrayList<Object> listDrums;
	
	public AccousticCollection() {
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
