package main.java.com;

import main.java.dao.RuoloDaoJdbc;
import main.java.model.Ruolo;

public class TestRuolo {


    public static void main(String[] args) {
        Ruolo ruolo = new Ruolo();
        ruolo.setNome("Rosario");
        ruolo.setRuolo("junior software developer");

        RuoloDaoJdbc ruoloDaoJdbc = new RuoloDaoJdbc();
        ruoloDaoJdbc.inserisci(ruolo);
    }
    
}
