package main.java.model;

import java.sql.Date;

public class Storico {
    Date dataInizio;
    Date dataFine;

    public Storico() {}

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
}
