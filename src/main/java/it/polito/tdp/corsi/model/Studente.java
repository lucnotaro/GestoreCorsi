package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Studente {

	private Integer matricola;
	private String cognome;
	private String nome;
	private String CDS;
	
	public Studente(Integer matricola, String cognome, String nome, String cDS) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.CDS = cDS;
	}

	public Integer getMatricola() {
		return matricola;
	}

	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCDS() {
		return CDS;
	}

	public void setCDS(String cDS) {
		this.CDS = cDS;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + ", CDS=" + CDS + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CDS, cognome, matricola, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		return Objects.equals(CDS, other.CDS) && Objects.equals(cognome, other.cognome)
				&& Objects.equals(matricola, other.matricola) && Objects.equals(nome, other.nome);
	}
	
	
	
}
