package it.polito.tdp.corsi.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.model.Corso;

public class TestDAO {

	public static void main(String[] args) {
		
		CorsoDAO dao=new CorsoDAO();
		
		List<Corso> resultCorsi=new ArrayList<>();
		resultCorsi=dao.getCorsiByPeriodo(1);
		for(Corso c:resultCorsi)
			System.out.println(c);
		
		System.out.println("\n");
		
		Map<Corso,Integer> resultIscritti=new HashMap<>();
		resultIscritti=dao.getCorsiIscritti(1);
		for(Corso c:resultIscritti.keySet())
			System.out.println(c+" Numero Iscritti= "+resultIscritti.get(c));
	}

}
