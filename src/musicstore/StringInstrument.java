package musicstore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringInstrument extends Instrument implements Tunable{
	protected int nbcorde;
	protected String typebois;
	protected String tuneDate;
	protected String tuneType;
	
	public StringInstrument(int nbcorde, String typebois, String tuneType, String brand, String model, float price, boolean state) {
		super(brand, model, price, state);
		this.nbcorde = nbcorde;
		this.typebois = typebois;
		this.tuneType = tuneType;
	}
	
	public int getNbCorde() {
		return this.nbcorde;
	}
	
	public String getTypeBois() {
		return this.typebois;
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
	}
}
