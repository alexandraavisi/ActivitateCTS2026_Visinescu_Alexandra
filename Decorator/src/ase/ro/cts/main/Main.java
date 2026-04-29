package ase.ro.cts.main;

import ase.ro.cts.clase.NotaDePlata;
import ase.ro.cts.clase.NotaDePlataAbstract;
import ase.ro.cts.decorator.AnNouNotaDePlata;
import ase.ro.cts.decorator.NotaDePlataDecorator;
import ase.ro.cts.decorator.UnuMaiNotaDePlata;

public class Main {

    static void main() {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(199f, "19.04.2026");
        notaDePlata.printeaza();

        System.out.println("--------------");

        int a=2;
        NotaDePlataDecorator decorator;

        if (a==1) {
            decorator = new AnNouNotaDePlata(notaDePlata);
        } else {
            decorator = new UnuMaiNotaDePlata(notaDePlata);
        }

        decorator.printeaza();
        decorator.printeazaFelicitare();

    }
}
