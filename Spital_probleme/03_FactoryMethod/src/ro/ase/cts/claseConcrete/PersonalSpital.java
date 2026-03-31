package ro.ase.cts.claseConcrete;

public abstract class PersonalSpital {
    protected String nume;
    protected double salariu;

    public PersonalSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afiseazaDetalii();
}
