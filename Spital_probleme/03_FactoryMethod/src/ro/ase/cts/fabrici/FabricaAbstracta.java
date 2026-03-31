package ro.ase.cts.fabrici;

import ro.ase.cts.claseConcrete.PersonalSpital;
import ro.ase.cts.enums.TipPersonalSpital;

public interface FabricaAbstracta {
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu);
    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, double salariu, String specializare);
}
