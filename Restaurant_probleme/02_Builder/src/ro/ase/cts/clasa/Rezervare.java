package ro.ase.cts.clasa;

public class Rezervare {
    public boolean asezareLaGeam;
    public boolean scauneErgonomice;
    public boolean decorareaMesei;
    public boolean muzicaAmbientalaPersonalizata;
    public boolean genMuzica;
    public String numeClient;
    public String numarTelefonClient;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, boolean genMuzica, String numeClient, String numarTelefonClient) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
        this.numarTelefonClient = numarTelefonClient;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNumarTelefonClient(String numarTelefonClient) {
        this.numarTelefonClient = numarTelefonClient;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", numarTelefonClient='").append(numarTelefonClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
