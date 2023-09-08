package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;
import it.polito.tdp.corsi.db.StudenteDAO;

public class Model {
	
	private CorsoDAO corsoDAO;
	private StudenteDAO studenteDAO;
	
	public Model() {
		this.corsoDAO = new CorsoDAO();
		this.studenteDAO=new StudenteDAO();
	}

	public List<Corso> getCorsiByPeriodo(int periodo){
		return this.corsoDAO.getCorsiByPeriodo(periodo);
	}
	
	public Map<Corso,Integer> getCorsiIscritti(int periodo){
		return this.corsoDAO.getCorsiIscritti(periodo);
	}
	
	public List<Studente> getIscrittiCorso(String codins){
		return this.studenteDAO.getIscrittiCorso(codins);
	}
	
	public List<Divisione> getDivisioneStudentiCorso(String codins){
		return this.studenteDAO.getDivisioneStudentiCorso(codins);
	}
}
