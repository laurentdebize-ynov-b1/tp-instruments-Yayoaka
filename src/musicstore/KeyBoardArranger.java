package musicstore;

public class KeyBoardArranger extends KeyboardInstrument {
	private int nbSound;
	
	public KeyBoardArranger(int nbSound,int nbtouches, String brand, String model, float price, boolean state) {
		super(nbtouches, brand, model, price, state);
		this.nbSound = nbSound;
		
	}
	
	public int getNbSound() {
		return this.nbSound;
	}
}
