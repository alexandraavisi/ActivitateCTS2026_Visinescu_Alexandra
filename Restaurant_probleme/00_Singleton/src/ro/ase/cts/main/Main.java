package ro.ase.cts.main;

import ro.ase.cts.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = Manager.getInstance("Mihai Ionescu", "0765234234", 10000);
        Manager manager2 = Manager.getInstance("Andreea Vladu", "0789668550", 9500);
        Manager manager3 = Manager.getInstance("Cosmina Iordache", "0723378923", 12450);

        manager2.afiseazaDetaliiManager();
        manager3.afiseazaDetaliiManager();

        manager2.primesteNorificare("A sosit marfa restaurantului");
        manager1.primesteNorificare("Rezezervare noua creata");
    }
}