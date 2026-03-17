package ro.ase.cts.clase;

public class InternareBuilderAlternativ implements InternareBuilderAbstractAlternativ {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatDeInterior;

    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halatDeInterior = false;
    }

    public InternareBuilderAlternativ setPatRabatabil(boolean arePatRabatabil) {
        this.patRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejunInclus(boolean areMicDejunInclus) {
        this.micDejunInclus = areMicDejunInclus;
        return this;
    }

    public InternareBuilderAlternativ setPapuciDeCamera(boolean arePapuciDeCamera) {
        this.papuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public InternareBuilderAlternativ setHalatDeInterior(boolean areHalatDeInterior) {
        this.halatDeInterior = areHalatDeInterior;
        return this;
    }


    @Override
    public Internare build(String nume) {
        Internare internare = new Internare(this.patRabatabil, this.micDejunInclus,  this.papuciDeCamera, this.halatDeInterior, nume);
        return  internare;
    }
}
