package ase.ro.cts.main;

import ase.ro.cts.clase.Medic;
import ase.ro.cts.clase.Pacient;
import ase.ro.cts.clase.ReceptieSpital;
import ase.ro.cts.clase.Salon;

public class Main {
    static void main() {
        Pacient pacient = new Pacient("Ionel Popescu", 5);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if (medic.areTrimitere(pacient)) {
            int patLiber = salon.getPatLiber();

            if (patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            }
        }

        Pacient pacient2 = new Pacient("Ionel Popescu", 5);
        Pacient pacient3 = new Pacient("Geta", 1);
        Pacient pacient4 = new Pacient("Marius", 10);

        ReceptieSpital receptieSpital = new ReceptieSpital(medic, salon);
        receptieSpital.interneazaPacient(pacient2);
        receptieSpital.interneazaPacient(pacient3);
        receptieSpital.interneazaPacient(pacient4);
    }
}
