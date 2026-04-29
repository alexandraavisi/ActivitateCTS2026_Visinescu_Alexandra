package ase.ro.cts.decorator;

import ase.ro.cts.clase.NotaDePlataAbstract;

public class UnuMaiNotaDePlata extends  NotaDePlataDecorator {
    public UnuMaiNotaDePlata(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Hai la bere si gratar!");
    }
}
