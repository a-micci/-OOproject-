package apCommon;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tratta {
	
	//Attributi
	private String citt�;
	private Volo volo;
	
	//Costruttori
	
	
	//Metodi
	public String getCitt�() {
		return citt�;
	}
	
	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}
	
	public Volo getVolo() { //TO-DO
		return volo.getVoloInfo();
	}
	
	public void setVolo(Volo volo){
		this.volo = volo;
	}
}
