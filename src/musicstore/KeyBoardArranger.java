package musicstore;

public class KeyBoardArranger extends KeyboardInstrument {
	private int nbSounds;
	
	public KeyBoardArranger(int nbSounds,int nbKeys, String brand, String model, float price, boolean state) {
		super(nbKeys, brand, model, price, state);
		this.nbSounds = nbSounds;
		
	}
	
	public int getNbSounds() {
		return this.nbSounds;
	}
	
	public String toString() {
	return "keyboard arranger " + this.brand +
			  " : model " + this.model +
			  ", nb sounds " + this.nbSounds +
			  ", nb keys " + getNbKeys();
	}
}
