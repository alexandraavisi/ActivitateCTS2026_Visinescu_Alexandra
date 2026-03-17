package ro.ase.cts.clase;

public class InternareBuilder implements InternareBuiderAbstract {
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);
    }

    public InternareBuilder setPatRabatabil(boolean arePatRabatabil) {
        internare.patRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuilder setMicDejunInclus(boolean areMicDejunInclus) {
        internare.micDejunInclus = areMicDejunInclus;
        return this;
    }

    public InternareBuilder setPapuciDeCamera(boolean arePapuciDeCamera) {
        internare.papuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public InternareBuilder setHalatDeInterior(boolean areHalatDeInterior) {
        internare.halatDeInterior = areHalatDeInterior;
        return this;
    }

    public InternareBuilder setNumePacient(String nume) {
        internare.numePacient = nume;
        return this;
    }

    @Override
    public Internare build()
    {
        return internare;
    }
}
