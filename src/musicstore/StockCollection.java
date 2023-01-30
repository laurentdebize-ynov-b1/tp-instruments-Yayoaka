package musicstore;

import java.util.ArrayList;

public class StockCollection <E> {
	private ArrayList<Object> stockInstruments;
	
	public StockCollection() {
		stockInstruments = new ArrayList<Object>();
	}
	  
	public void add(E instrument) {
		stockInstruments.add(instrument);
	}
	  
	public void remove(Object instrument) {
		stockInstruments.remove(instrument);
	}
	  
	public ArrayList<Object> getDrums() {
	    return stockInstruments;
	}
}
