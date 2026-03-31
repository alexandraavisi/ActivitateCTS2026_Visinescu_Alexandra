package ro.ase.cts.fabrici;

import ro.ase.cts.claseConcrete.Asistent;
import ro.ase.cts.claseConcrete.Brancardier;
import ro.ase.cts.claseConcrete.Medic;
import ro.ase.cts.claseConcrete.PersonalSpital;
import ro.ase.cts.enums.TipPersonalMedical;
import ro.ase.cts.enums.TipPersonalSpital;

public class FabricaPeronalMedical implements FabricaAbstracta {

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu) {
        return getPersonalSpital(tip, nume, salariu, "Necunoscut");
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu, String specializare) {
        if (tip == TipPersonalMedical.MEDIC) {
            return new Medic(nume, salariu, specializare);
        } else if (tip == TipPersonalMedical.ASISTENT) {
            return new Asistent(nume, salariu, specializare);
        } else if (tip == TipPersonalMedical.BRANCARDIER) {
            return new Brancardier(nume, salariu, specializare);
        }

        return null;
    }
}
