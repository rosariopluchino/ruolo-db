package main.java.com;

import java.sql.Date;

import main.java.dao.StoricoDaoJdbc;
import main.java.model.Storico;

public class TestStorico {

    public static void main(String[] args) {
        Storico storico = new Storico();

        Date now = new Date(System.currentTimeMillis());
        storico.setDataInizio(now);
        storico.setDataFine(now);

        StoricoDaoJdbc storicoDaoJdbc = new StoricoDaoJdbc();
        storicoDaoJdbc.inserisci(storico);
        storicoDaoJdbc.elimina(1);
    }
}
