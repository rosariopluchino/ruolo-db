package main.java.dao;

import main.java.model.Storico;

public class StoricoDaoJdbc {

    public void inserisci(Storico s) {
        System.out.println("Inserita al db la data di inizio: " + s.getDataInizio());
        System.out.println("Inserita al db la data di fine: " + s.getDataFine());
    }

    public void elimina(int idStorico) {
        System.out.println("Eliminato lo storico con id: " + idStorico);
    }
}
