package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }
    @Override
    public void preda() {
        System.out.println("Profesorul " +getNume()+" preda cursul.");
    }
}
