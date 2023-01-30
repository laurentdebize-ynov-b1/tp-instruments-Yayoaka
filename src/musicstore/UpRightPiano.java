package musicstore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpRightPiano extends KeyboardInstrument implements Tunable{
	protected String hammerWood;
	protected String tuneDate;
	protected String tuneType;
	final int pianoPrice = 1000;
	
	public UpRightPiano(String hammerWood,String tuneType, int nbKeys, String brand, String model, float price, boolean state) {
		super(nbKeys, brand, model, price, state);
		this.hammerWood = hammerWood;
		this.tuneType = tuneType;
	}
	
	public String getHammerWood() {
		return this.hammerWood;
	}
	
	public void setHammerWood(String hammer) {
		this.hammerWood = hammer;
	}
	
	public String getTuneDate() {
		return this.tuneDate;
	}
	
	public String getTuneType() {
		return this.tuneType;
	}
	

	@Override
	public void tuning(String tune) {
		this.tuneType = tune;
	    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	    Date curDate = new Date();
		this.tuneDate = s.format(curDate);
		System.out.println("Piano price : " + this.pianoPrice);
	}
	
	public String toString() {
	return "violon " + this.brand +
			  " : model " + this.model +
			  ", accordage " + this.tuneType +
			  ", date d'accordage " + this.tuneDate +
			  ", type hammer wood " + this.hammerWood +
			  ", nb keys " + getNbKeys();
	}
}
