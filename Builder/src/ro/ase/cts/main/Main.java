package ro.ase.cts.main;

import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.InternareBuilder;
import ro.ase.cts.clase.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(true, false, true, true, "Mihai Popescu");
        Internare internare2 = new Internare(false, false, false, false, "Diana Ionescu");

        InternareBuilder builder = new InternareBuilder("Marcel Constantin");
        Internare internare3 = builder.build();

        Internare internare4 = builder.setNumePacient("Andrei Matei")
                .setPatRabatabil(true)
                .setPapuciDeCamera(true)
                .setHalatDeInterior(true)
                .build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejunInclus(true);
        Internare internare101  = builderAlternativ.build("Mihai Popescu");
        Internare internare102  = builderAlternativ.build("Diana Ionescu");

        //internare101.setNumePacient("Mioara Matei"); // nu mai putem schimba doarece acum setterii sunt protected, o varianta buna ar fi sa facem cu innerClass

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
    }
}
