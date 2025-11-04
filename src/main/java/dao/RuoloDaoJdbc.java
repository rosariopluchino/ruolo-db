package main.java.dao;

import main.java.model.Ruolo;

public class RuoloDaoJdbc {
    private Ruolo r = new Ruolo();

    public void inserisci(Ruolo r){
        System.out.println("Inserito al db il nome: " + r.getNome());
        System.out.println("Inserito al db il ruolo: " + r.getRuolo());
    }

    public void aggiorna(Ruolo r) {
        System.out.println("id: " +r.getId());
        System.out.println(r.getNome());
        System.out.println(r.getRuolo());
    }

    public Ruolo ricercaPerId(int matricola) {
        r.setId(1);
        r.setNome("rosario");
        r.setRuolo("software developer");
        return r;
    }
}
