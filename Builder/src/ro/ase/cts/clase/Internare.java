package ro.ase.cts.clase;

public class Internare {
    protected boolean patRabatabil;
    protected boolean micDejunInclus;
    protected boolean papuciDeCamera;
    protected boolean halatDeInterior;
    protected String numePacient;

    public Internare(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatDeInterior, String numePacient) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatDeInterior = halatDeInterior;
        this.numePacient = numePacient;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    protected void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setHalatDeInterior(boolean halatDeInterior) {
        this.halatDeInterior = halatDeInterior;
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatDeInterior=").append(halatDeInterior);
        sb.append(", numePacient='").append(numePacient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
