package apCommon;

import apViews.AMain.IDTratta;
import apViews.AMain.citt�;

public class Tratta {
	
	//Attributi
	private Volo volo;
	private citt� citt�;
	private IDTratta IDtratta;
	
	//Costruttore vuoto
	public Tratta() {
	}
	
	//Costruttore con attributi
	public Tratta(Volo volo, citt� citt�, IDTratta IDtratta) {
		this.volo=volo;
		this.citt�=citt�;
		this.IDtratta = IDtratta;
	}
	
	//Metodi
	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	public citt� getCitt�() {
		return citt�;
	}

	public void setCitt�(citt� citt�) {
		this.citt� = citt�;
	}

	public IDTratta getIDtratta() {
		return IDtratta;
	}

	public void setIDtratta(IDTratta iDtratta) {
		IDtratta = iDtratta;
	}
	
}
