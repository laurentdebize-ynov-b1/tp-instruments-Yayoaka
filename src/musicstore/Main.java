package musicstore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		
		//String micro, int nbStrings, String woodType, String tuneType,int id , String brand, String model, float price, boolean state
		ElectricGuitar guitar1 = new ElectricGuitar("Fender", 6, "beech", "Open", 1, "Fender", "Gibson", 150.10f, true);
		guitar1.tuning("Drop D");
		Violin violin1 = new Violin("fiberglass", 4, "beech", "Open", 2, "Fender", "Gibson", 200.00f, true);
		violin1.tuning("Classic");
		
//		UpRightPiano uprightpiano1 = new UpRightPiano("fiberglass", 4, "beech", "Open", "Fender", "Gibson", 200.00f, true);
//		uprightpiano1.tuning("Classique");
		
//		BassPad pad1 = new BassPad(60, "hetre");
		
		
		ArrayList<Instrument> stock = new ArrayList<Instrument>();
		stock.add(guitar1);
		stock.add(violin1);
		
		
		int choice;

		do {
			System.out.println("1 view all instruments");
			System.out.println("2 see an instrument");
			System.out.println("3 add instrument (dev a finir)");
			System.out.println("4 modify an instrument (dev a finir)");
			System.out.println("5 delete an instrument (dev a finir)");
			System.out.println("6 leave");


			choice = input.nextInt();
			switch (choice) {
			case 1:
				for(Instrument instru : stock) {
					System.out.println(instru);
				}
				break;
			case 2:
				System.out.print("ID : ");
				int id = input.nextInt();
				int position = find(stock, id);
				if(-1 == position) {
					System.out.println("Cet ID n'existe pas");
				}else {
					System.out.println(stock.get(position));
				}
				break;
			}
		} while (choice != 7);

		input.close();
		
		
		System.out.println(guitar1);
		System.out.println(violin1);
		
		
//		ArrayList<ElectronicDrums> electDrum1 = new ArrayList<ElectronicDrums>();
//		electDrum1.add(pad1);
		
//		Percussion	boolean bIsConnected ,boolean bismounted, String brand, String model, float price, boolean state
//		ElectronicDrums drum1 = new ElectronicDrums(false, true, "marque", "model", 105.00f, true);
//		drum1.addPercu(new BassPad(60, "hetre"));
		
		
//		System.out.println(drum1);
		
		

		
		


	}
	
	
	private static int find(ArrayList<Instrument> stock, int id) {
		int i = 0;
		for(Instrument instru : stock) {
			if(instru.getId() == id) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
}
