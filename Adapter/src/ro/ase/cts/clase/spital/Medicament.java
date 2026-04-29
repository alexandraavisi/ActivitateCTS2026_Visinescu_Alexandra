package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public String getNume() {
        return nume;
    }

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Medicamentul " + nume + " a fost achizitional la pretul de " + pret + " lei");
        } else {
            System.out.println("Nu a prezentat reteta");
        }
    }

    public boolean prezintaReteta() {
        return (nume.length()>10 );
    }

}
