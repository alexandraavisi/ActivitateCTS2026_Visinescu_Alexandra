package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Cabana Plapumiora", 15, 8);
        Hotel hotel2 = Hotel.getInstance("Grand Hotel", 200, 23);
        //getInstance este o metoda statica, astfel se apeleaza prin numele clasei!

        hotel1.rezervaCamera();
        hotel2.rezervaCamera();

        hotel1.afiseazaDetaliiHotel();
        hotel1.calculeazaGradOcupare();

        hotel2.afiseazaDetaliiHotel();
    }
}
