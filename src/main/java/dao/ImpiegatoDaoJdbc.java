package main.java.dao;

import main.java.model.Impiegato;

public class ImpiegatoDaoJdbc {
    public void aggiorna(Impiegato i){
        System.out.println("'id: " + i.getId());
        System.out.println("nome: " + i.getNome());
        System.out.println("cognome: " + i.getCognome());
        System.out.println("età: " + i.getEta());
    }

    public Impiegato findById(int id) {
        if(id != 1) {
            System.out.println("l'impiegato con id: " + id + " non esiste");
            return null;
        }
        else {
            Impiegato i = new Impiegato();
            i.setNome("aldo");
            i.setCognome("rossi");
            i.setEta(24);
            i.setId(1);
            System.out.println("l'impiegato con id: " + id + " è:");
            System.out.println(" Nome: " + i.getNome());
            System.out.println(" Cognome: " + i.getCognome());
            System.out.println(" Età: " + i.getEta());
            return i;
        }
    }

    public Impiegato ricercaPerId(int matricola) {
            Impiegato i = new Impiegato();
            i.setNome("aldo");
            i.setCognome("rossi");
            i.setEta(24);
            i.setId(1);
            return i;
    }

}
