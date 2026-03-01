package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul "+ getNume() + " preda seminarul.");
    }
}
