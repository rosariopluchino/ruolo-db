package main.java.model;

public class Ruolo {
    int id;
    String nome;
    String ruolo;

    public Ruolo() {}

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getId() {
        return id;
    }
}
