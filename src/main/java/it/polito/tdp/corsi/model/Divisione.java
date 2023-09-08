package it.polito.tdp.corsi.model;

public class Divisione {

	private String CDS;
	private Integer nStudenti;
	
	public Divisione(String cDS, Integer nStudenti) {
		CDS = cDS;
		this.nStudenti = nStudenti;
	}

	public String getCDS() {
		return CDS;
	}

	public Integer getnStudenti() {
		return nStudenti;
	}

	@Override
	public String toString() {
		return "CDS=" + CDS + "   nStudenti=" + nStudenti;
	}
	
	
}
