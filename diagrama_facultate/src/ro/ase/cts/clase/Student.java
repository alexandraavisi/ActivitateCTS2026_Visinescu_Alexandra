package ro.ase.cts.clase;

import ro.ase.cts.interfete.IPredabil;

public class Student extends Persoana{
    private String idStudent;

    public Student(String nume, int varsta, String idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }
}
