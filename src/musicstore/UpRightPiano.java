package musicstore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UpRightPiano extends KeyboardInstrument implements Tunable{
	protected String hammerBois;
	protected String tuneDate;
	protected String tuneType;
	
	public UpRightPiano(String hammerBois,String tuneType, int nbtouches, String brand, String model, float price, boolean state) {
		super(nbtouches, brand, model, price, state);
		this.hammerBois = hammerBois;
		this.tuneType = tuneType;
	}
	
	public String getHammerBois() {
		return this.hammerBois;
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
