package ro.ase.cts.main;

import ro.ase.cts.clase.Reteta;
import ro.ase.cts.clase.RetetaPrototype;

public class Main {
    public static void main(String[] args) {
        RetetaPrototype reteta1 = new Reteta("Nurofen", 14.5, 30, 4);

        RetetaPrototype reteta2 = reteta1.clone();

        ((Reteta)reteta1).setIdChimist(10);

        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());

        ((Reteta)reteta2).setIdChimist(2);

        System.out.println(reteta2.toString());
    }
}
