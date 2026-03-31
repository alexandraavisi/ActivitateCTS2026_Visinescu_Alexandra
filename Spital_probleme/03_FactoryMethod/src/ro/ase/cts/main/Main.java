package ro.ase.cts.main;

import ro.ase.cts.claseConcrete.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.enums.TipPersonalSpital;
import ro.ase.cts.fabrici.FabricaPeronalMedical;
import ro.ase.cts.fabrici.FabricaPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaPeronalMedical fabricaPeronalMedical = new FabricaPeronalMedical();
        FabricaPersonalNonMedical fabricaPersonalNonMedical = new FabricaPersonalNonMedical();

        PersonalSpital asistent = fabricaPeronalMedical.getPersonalSpital(TipPersonalMedical.ASISTENT, "Ioana Marinescu", 6500, "cardiologie" );
        PersonalSpital medic = fabricaPeronalMedical.getPersonalSpital(TipPersonalMedical.MEDIC, "Adrian Ionescu", 15000, "chirurgie plastica");
        PersonalSpital brancardier = fabricaPeronalMedical.getPersonalSpital(TipPersonalMedical.BRANCARDIER, "Cosmina Iordache", 4000, "urgente");

        PersonalSpital secretar = fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.SECRETAR, "Andrei Vasile", 6000);
        PersonalSpital registrator = fabricaPersonalNonMedical.getPersonalSpital(TipPersonalNonMedical.REGISTRATOR, "Maria Dragomir", 4500);

        asistent.afiseazaDetalii();
        medic.afiseazaDetalii();
        brancardier.afiseazaDetalii();

        secretar.afiseazaDetalii();
        registrator.afiseazaDetalii();
    }
}
