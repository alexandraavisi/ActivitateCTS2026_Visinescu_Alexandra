package ro.ase.cts.factory;

import ro.ase.cts.claseConcrete.Supa;
import ro.ase.cts.claseConcrete.SupaCiuperci;
import ro.ase.cts.claseConcrete.SupaLegume;
import ro.ase.cts.claseConcrete.SupaVita;

public class FabricaSupa {
    public Supa getSupa(TipSupa tip, double grame, double pret) {
        if (tip == TipSupa.LEGUME) {
            return new SupaLegume(grame, pret);
        }

        if (tip == TipSupa.CIUPERCI) {
            return new SupaCiuperci(grame, pret);
        }

        if(tip == TipSupa.VITA) {
            return new SupaVita(grame, pret);
        }

        return null;
    }
}
