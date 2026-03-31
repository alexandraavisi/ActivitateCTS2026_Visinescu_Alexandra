package ro.ase.cts.main;

import ro.ase.cts.builder_metoda1.RezervareBuilder;
import ro.ase.cts.builder_metoda2.RezervareBuilderAlternativ;
import ro.ase.cts.clasa.Rezervare;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Mihai Alexandru", "0755234232");
        Rezervare rezervare1 = builder.build();

        System.out.println(rezervare1);

        Rezervare rezervare2 = builder.setNumeClient("Maria Ionela")
                .setAsezareLaGeam(true)
                .setDecorareaMesei(true)
                .setGenMuzica(true)
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);

        //=======================================//
        System.out.println("-----------");

        RezervareBuilderAlternativ builderAlternativ = new RezervareBuilderAlternativ();
        builderAlternativ.setAsezareLaGeam(true);
        Rezervare rezervare3 = builderAlternativ.build("Andrei Simion", "0711221121");
        builderAlternativ.setGenMuzica(true);
        Rezervare rezervare4 = builderAlternativ.build("Mariana Diaconu", "0733222555");
        rezervare4.setGenMuzica(false);
        System.out.println(rezervare3);
        System.out.println(rezervare4);
    }
}
