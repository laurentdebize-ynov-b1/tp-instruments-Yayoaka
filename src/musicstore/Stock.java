package musicstore;

import java.util.ArrayList;

public class Stock {
	
	private ArrayList<Object> stockInstruments;
		
		public Stock() {
			
			
			ArrayList<Object> stockInstruments = new ArrayList<Object>();
			//listDrums.addPercussion(bassPad1);
			
		}
		
		public void addToStock(Object instrument) {
			this.stockInstruments.add(instrument);
		}
		  
		public void removeFromStock(Object instrument) {
			this.stockInstruments.remove(instrument);
		}
		
	    public void display() {
	    	System.out.print(this.stockInstruments.size() + " ");
//	        for (int i = 0; i < this.stockInstruments.size(); i++) {
//	            System.out.print(this.stockInstruments.get(i) + " ");
//	        }
//	        System.out.println();
	    }
}
