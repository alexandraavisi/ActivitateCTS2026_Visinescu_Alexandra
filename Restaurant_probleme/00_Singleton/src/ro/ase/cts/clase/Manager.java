package ro.ase.cts.clase;

public class Manager {
    private String nume;
    private String numarTelefon;
    private double salariu;

    private static Manager instanta;

    private Manager(String nume, String numarTelefon, double salariu) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.salariu = salariu;
    }

    public static synchronized Manager getInstance(String nume, String numarTelefon, double salariu) {
        if(instanta == null) {
            instanta = new Manager(nume, numarTelefon, salariu);
        }
        return  instanta;
    }

    public void afiseazaDetaliiManager() {
        StringBuilder builder = new StringBuilder();
        builder.append("Managerul ");
        builder.append(this.nume);
        builder.append(": ");
        builder.append("nr telefon - " + this.numarTelefon + ", ");
        builder.append("salariu - " + this.salariu);
        System.out.println(builder);
    }

    public void primesteNorificare(String mesaj) {
        System.out.println("Notificare pentru managerul " +  this.nume + ": " + mesaj);
    }
}