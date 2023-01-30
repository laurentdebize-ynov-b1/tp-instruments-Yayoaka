package musicstore;

import java.util.ArrayList;

import computer.Computer;

public class Main {

	public static void main(String[] args) {	
		
		//String micro, int nbcorde, String typebois, String tuneType, String brand, String model, float price, boolean state
		ElectricGuitar guitar1 = new ElectricGuitar("Fender", 6, "hetre", "Open", "Fender", "Gibson", 150.10f, true);
		guitar1.tuning("Drop D");
		Violin violin1 = new Violin("fibre de verre", 4, "hetre", "Open", "Fender", "Gibson", 200.00f, true);
		violin1.tuning("Classique");
		
//		UpRightPiano uprightpiano1 = new UpRightPiano("fibre de verre", 4, "hetre", "Open", "Fender", "Gibson", 200.00f, true);
//		uprightpiano1.tuning("Classique");
		
		
		System.out.println(guitar1);
		System.out.println(violin1);
		
		
		
		ArrayList<Instrument> stock = new ArrayList<Instrument>();
		stock.add(guitar1);
		stock.add(violin1);
		stock.add(uprightpiano1);
	
//		Stock stock1 = new Stock();		
//		stock1.addToStock(guitar1);
//		stock1.addToStock(violin1);
//		stock1.display();

	}
	
	private static int find(ArrayList<Computer> computers, int id) {
		int i = 0;
		for(Computer computer : computers) {
			if(computer.getId() == id) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
}
