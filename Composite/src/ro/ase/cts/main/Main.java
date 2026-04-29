package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    static void main() {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");

        Structura secSecretariat = new Sectie("Secretariat", 2);
        Structura secMangement = new Sectie("Management", 10);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(secMangement);
        ((Departament) depAdministrativ).adaugaStructura(secSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura(secMangement);
        ((Departament) depAdministrativ).adaugaStructura(secMangement);

        System.out.println("--------------");
        depAdministrativ.afiseazaDetaliiStructura("");

    }
}
