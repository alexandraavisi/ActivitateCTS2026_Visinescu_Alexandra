package ro.ase.cts.main;

import ro.ase.cts.claseConcrete.Supa;
import ro.ase.cts.factory.FabricaSupa;
import ro.ase.cts.factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();

        Supa supaLegume = fabricaSupa.getSupa(TipSupa.LEGUME, 250, 15);
        Supa supaCiuperci = fabricaSupa.getSupa(TipSupa.CIUPERCI, 250, 20);
        Supa supaVita = fabricaSupa.getSupa(TipSupa.VITA, 250, 25);

        supaLegume.afiseazaDescriere();
        supaCiuperci.afiseazaDescriere();
        supaVita.afiseazaDescriere();
    }
}
