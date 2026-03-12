package ro.ase.cts.main;

import ro.ase.cts.claseConcrete.MijlocTransport;
import ro.ase.cts.factory.Depou;
import ro.ase.cts.factory.TipuriMijloaceTransport;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(TipuriMijloaceTransport.AUTOBUZ, 8, "B112STB");
        MijlocTransport tramvai = depou.getMijlocTransport(TipuriMijloaceTransport.TRAMVAI, 22, "B453STB");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
