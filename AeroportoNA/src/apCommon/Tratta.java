package apCommon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import apCommon.TrattaDao;

public class Tratta {
	
	//Attributi
	private Volo volo;
	private String citt�;
	//private IDTratta IDtratta;
	
	//Costruttore vuoto
	public Tratta() {
		
	}
	
	//Costruttore con attributi
	public Tratta(Volo volo, String citt�) {
		this.volo=volo;
		this.citt�=citt�;
	}
	
	//Metodi
	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	public String getCitt�() {
		return citt�;
	}

	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}

	public interface TrattaDao {
		public List<String> getAllCitt�() throws SQLException;
	}
	
	
}
