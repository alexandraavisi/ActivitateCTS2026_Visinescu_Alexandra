package ro.ase.cts.main;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Curs;
import ro.ase.cts.clase.Profesor;
import ro.ase.cts.clase.Student;
import ro.ase.cts.interfete.IPredabil;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Popescu Ionel", 45, "P01");
        Asistent asistent = new Asistent("Ionescu Marcel", 34, "A01");

        Student s1 = new Student("Vlad Ioana", 21, "S105");
        Student s2 = new Student("Visan Marius", 19, "S455");

        IPredabil p1 = profesor;
        IPredabil p2 = asistent;

        p1.preda();
        p2.preda();

        Curs curs = new Curs("Baze de date", 6, profesor);

        System.out.println("Curs: " + curs.getNumeCurs() +", credite: " + curs.getCredite());

        System.out.println("Profesor: " + profesor.getNume() + " " + profesor.getVarsta());
        System.out.println("Asistent: " + asistent.getNume() + " " + asistent.getVarsta());
        System.out.println("Student: " + s1.getNume() + " " + s1.getVarsta());
    }
}
