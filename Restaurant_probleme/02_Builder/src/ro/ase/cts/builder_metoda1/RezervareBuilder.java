package ro.ase.cts.builder_metoda1;

import ro.ase.cts.clasa.Rezervare;

public class RezervareBuilder implements RezervareAbstractBuilder {
   private Rezervare rezervare;

   public RezervareBuilder(String nume, String nrTelefon) {
       this.rezervare = new Rezervare(false, false, false, false, false, nume, nrTelefon);
   }

   public RezervareBuilder setAsezareLaGeam(boolean areAsezareLaGeam) {
       rezervare.asezareLaGeam = areAsezareLaGeam;
       return this;
   }

   public RezervareBuilder setScauneErgonomice(boolean areScauneErgonomice) {
       rezervare.scauneErgonomice = areScauneErgonomice;
       return this;
   }

   public RezervareBuilder setDecorareaMesei(boolean areDecorareaMesei) {
       rezervare.decorareaMesei = areDecorareaMesei;
       return this;
   }

   public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
       rezervare.muzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
       return this;
   }

   public RezervareBuilder setGenMuzica(boolean areGenMuzica) {
       rezervare.genMuzica = areGenMuzica;
       return this;
   }

   public RezervareBuilder setNumeClient(String nume) {
       rezervare.numeClient  = nume;
       return this;
    }

   public RezervareBuilder setNumarTelefonClient (String nrTelefon) {
       rezervare.numarTelefonClient = nrTelefon;
       return this;
   }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
