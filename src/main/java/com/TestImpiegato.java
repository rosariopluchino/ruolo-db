package main.java.com;

import main.java.dao.ImpiegatoDaoJdbc;
import main.java.model.Impiegato;

public class TestImpiegato {
    
    public static void main(String[] args) {
        Impiegato impiegato1 = new Impiegato();
        impiegato1.setId(1);
        impiegato1.setNome("aldo");
        impiegato1.setCognome("rossi");
        impiegato1.setEta(24);

        Impiegato impiegato2 = new Impiegato();
        impiegato2.setId(1);
        impiegato2.setNome("rosario");
        impiegato2.setCognome("bianchini");
        impiegato2.setEta(26);

       /* ImpiegatoDaoJdbc impiegatoDaoJdbc = new ImpiegatoDaoJdbc();
        //impiegatoDaoJdbc.findById(1);
        Impiegato trovato = impiegatoDaoJdbc.findById(1);
        if(trovato != null) {
            System.out.println("ID: " + trovato.getId());
            System.out.println("Nome: " + trovato.getNome());
            System.out.println("Cognome: " + trovato.getCognome());
            System.out.println("Età: " + trovato.getEta());
        } else {
            System.out.println("Impiegato non trovato");
        }*/

        String nomeDaCercare = "rosario";
        if(impiegato2.getNome().equals(nomeDaCercare)) {
            System.out.println(impiegato2.getNome());
            System.out.println(impiegato2.getEta());
            System.out.println(impiegato2.getId());
        } else {
            if(impiegato1.getNome().equals(nomeDaCercare)) {
                System.out.println(impiegato1.getNome());
                System.out.println(impiegato1.getEta());
                System.out.println(impiegato1.getId());
            }
        }
    }
}
