package main.java.dao;

import main.java.model.Storico;

public class StoricoDaoJdbc {
    public void inserisci(Storico s) {
        System.out.println("Inserita al db la data di inizio: " + s.getDataInizio());
        System.out.println("Inserita al db la data di fine: " + s.getDataFine());
    }
}
