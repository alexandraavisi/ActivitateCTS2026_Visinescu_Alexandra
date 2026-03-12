package ro.ase.cts.factory;

import ro.ase.cts.claseConcrete.Autobuz;
import ro.ase.cts.claseConcrete.MijlocTransport;
import ro.ase.cts.claseConcrete.Tramvai;
import ro.ase.cts.claseConcrete.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(TipuriMijloaceTransport tip, int numarRoti, String numarInmatriculare){
        if (tip == TipuriMijloaceTransport.AUTOBUZ){
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tip == TipuriMijloaceTransport.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tip == TipuriMijloaceTransport.TROLEIBUZ){
            return new Troleibuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
