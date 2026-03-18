package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPersoana;

public class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }
}
