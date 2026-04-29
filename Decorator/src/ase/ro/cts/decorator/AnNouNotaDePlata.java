package ase.ro.cts.decorator;

import ase.ro.cts.clase.NotaDePlataAbstract;

public class AnNouNotaDePlata extends NotaDePlataDecorator{

    public AnNouNotaDePlata(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("An nou fericit!");
    }

}
