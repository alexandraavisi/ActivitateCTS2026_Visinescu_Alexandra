package ro.ase.cts.builder_metoda2;

import ro.ase.cts.clasa.Rezervare;

public class RezervareBuilderAlternativ implements RezervareAbstractBuilderAlternativ{
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public RezervareBuilderAlternativ() {
        this.asezareLaGeam = false;
        this.scauneErgonomice = false;
        this.decorareaMesei = false;
        this.muzicaAmbientalaPersonalizata = false;
        this.genMuzica = false;
    }


    public RezervareBuilderAlternativ setAsezareLaGeam(boolean areAsezareLaGeam) {
        this.asezareLaGeam = areAsezareLaGeam;
        return this;
    }

    public RezervareBuilderAlternativ setScauneErgonomice(boolean areScauneErgonomice) {
        this.scauneErgonomice = areScauneErgonomice;
        return this;
    }

    public RezervareBuilderAlternativ setDecorareaMesei(boolean areDecorareaMesei) {
        this.decorareaMesei = areDecorareaMesei;
        return this;
    }

    public RezervareBuilderAlternativ setMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilderAlternativ setGenMuzica(boolean areGenMuzica) {
        this.genMuzica = areGenMuzica;
        return this;
    }

    @Override
    public Rezervare build(String nume, String nrTelefon) {
        Rezervare rezervare = new Rezervare(this.asezareLaGeam, this.scauneErgonomice, this.decorareaMesei, this.muzicaAmbientalaPersonalizata, this.genMuzica, nume, nrTelefon);
        return rezervare;
    }
}
