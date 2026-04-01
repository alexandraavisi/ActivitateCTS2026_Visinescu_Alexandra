package ro.ase.cts.clase;

public class Reteta implements RetetaPrototype {
    private String numeMedicament;
    private double cantitateSubstantaActiva;
    private double concentratie;
    private int idChimist;

    public Reteta() {

    }

    public Reteta(String numeMedicament, double cantitateSubstantaActiva, double concentratie, int idChimist) {
        this.numeMedicament = numeMedicament;
        this.cantitateSubstantaActiva = cantitateSubstantaActiva;
        this.concentratie = concentratie;

        if( idChimist >=0 && idChimist <=5 ) {
            this.idChimist = idChimist;
        } else {
            this.idChimist = -1;
        }
    }

    public void setIdChimist(int idChimist) {
        if( idChimist >=0 && idChimist <=5 ) {
            this.idChimist = idChimist;
        } else {
            this.idChimist = 10;
        }
    }

    @Override
    public RetetaPrototype clone() {
        Reteta retetaNoua = new Reteta();
        retetaNoua.numeMedicament = this.numeMedicament;
        retetaNoua.cantitateSubstantaActiva = this.cantitateSubstantaActiva;
        retetaNoua.concentratie = this.concentratie;
        retetaNoua.idChimist = this.idChimist;

        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", cantitateSubstantaActiva=").append(cantitateSubstantaActiva);
        sb.append(", concentratie=").append(concentratie);
        sb.append(", idChimist=").append(idChimist);
        sb.append('}');
        return sb.toString();
    }
}
