package ro.ase.cts.fabrici;

import ro.ase.cts.claseConcrete.PersonalSpital;
import ro.ase.cts.claseConcrete.Registrator;
import ro.ase.cts.claseConcrete.Secretar;
import ro.ase.cts.enums.TipPersonalNonMedical;
import ro.ase.cts.enums.TipPersonalSpital;

public class FabricaPersonalNonMedical implements FabricaAbstracta {

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu) {
        if (tip == TipPersonalNonMedical.REGISTRATOR) {
            return new Registrator(nume, salariu);
        } else if (tip == TipPersonalNonMedical.SECRETAR) {
            return new Secretar(nume, salariu);
        }

        return null;
    }

    @Override
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu, String specializare) {
        return getPersonalSpital(tip, nume, salariu);
    }
}
