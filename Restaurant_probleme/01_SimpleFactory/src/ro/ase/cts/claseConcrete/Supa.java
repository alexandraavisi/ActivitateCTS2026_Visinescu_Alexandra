package ro.ase.cts.claseConcrete;

public abstract class Supa {
    protected double grame;
    protected double pret;

    public Supa(double grame, double pret) {
        this.grame = grame;
        this.pret = pret;
    }

    public abstract void afiseazaDescriere();
}
