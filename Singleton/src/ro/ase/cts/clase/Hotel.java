package ro.ase.cts.clase;

public class Hotel {
    private String nume;
    private int numarCamere;
    private int numarCamereOcupate;

    private static Hotel instanta = null;

    private Hotel(String nume, int numarCamere, int numarCamereOcupate) {
        this.nume = nume;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String nume, int numarCamere, int numarCamereOcupate) {
        if (instanta == null) {
            instanta = new Hotel(nume, numarCamere, numarCamereOcupate );
        }
        return instanta;
    }

    public void rezervaCamera() {
        if(this.numarCamereOcupate < this.numarCamere) {
            System.out.println("Rezervarea a fost confirmata");
            numarCamereOcupate ++;
        } else {
            System.out.println("Nu mai exista camere disponibile!");
        }
    }

    public void afiseazaDetaliiHotel() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hotelul ");
        builder.append(this.nume);
        builder.append(" are ").append(this.numarCamere).append(" camere, ");
        builder.append("dintre care doar ").append(this.numarCamere-this.numarCamereOcupate).append(" camere disponibile");
        System.out.println(builder);
    }

    public void calculeazaGradOcupare() {
        double grad = (double) this.numarCamereOcupate/this.numarCamere * 100;
        System.out.println("Grad ocupare: " + grad + "%");
    }
}
