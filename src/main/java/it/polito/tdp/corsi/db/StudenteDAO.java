package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Divisione;
import it.polito.tdp.corsi.model.Studente;

public class StudenteDAO {

	public List<Studente> getIscrittiCorso(String codins){
		String sql="SELECT s.matricola, s.cognome, s.nome, s.CDS "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola=i.matricola AND i.codins=?";
		List<Studente> resultIscritti=new ArrayList<>();
		try {
			Connection conn=ConnectDB.getConnection();
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,codins);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				resultIscritti.add(new Studente(rs.getInt("matricola"),rs.getString("cognome"),rs.getString("nome"),rs.getString("CDS")));
			}
			st.close();
			rs.close();
			conn.close();
			return resultIscritti;
		} catch (SQLException e) {
			System.out.println("Errore in StudenteDAO!");
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Divisione> getDivisioneStudentiCorso(String codins){
		String sql="SELECT s.CDS, COUNT(*) AS n "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola=i.matricola AND i.codins=? "
				+ "GROUP BY s.CDS";
		List<Divisione> resultDivisione=new ArrayList<>();
		try {
			Connection conn=ConnectDB.getConnection();
			PreparedStatement st=conn.prepareStatement(sql);
			st.setString(1,codins);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				resultDivisione.add(new Divisione(rs.getString("CDS"),rs.getInt("n")));
			}
			st.close();
			rs.close();
			conn.close();
			return resultDivisione;
		} catch (SQLException e) {
			System.out.println("Errore in StudenteDAO!");
			e.printStackTrace();
			return null;
		}
	}
	
}
