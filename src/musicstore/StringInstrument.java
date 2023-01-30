package musicstore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringInstrument extends Instrument implements Tunable{
	protected int nbStrings;
	protected String woodType;
	protected String tuneDate;
	protected String tuneType;
	
	public StringInstrument(int nbStrings, String woodType, String tuneType,int id , String brand, String model, float price, boolean state) {
		super(id, brand, model, price, state);
		this.nbStrings = nbStrings;
		this.woodType = woodType;
		this.tuneType = tuneType;
	}
	
	public int getNbStrings() {
		return this.nbStrings;
	}
	
	public String getWoodType() {
		return this.woodType;
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
