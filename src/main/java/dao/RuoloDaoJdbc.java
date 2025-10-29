package main.java.dao;

import main.java.model.Ruolo;

public class RuoloDaoJdbc {
    public void inserisci(Ruolo r){
        System.out.println("Inserito al db il nome: " + r.getNome());
        System.out.println("Inserito al db il ruolo: " + r.getRuolo());
    }
}
