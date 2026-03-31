package ro.ase.cts.claseConcrete;

public abstract class PersonalMedical extends PersonalSpital {

    protected String specializare;

    public PersonalMedical(String nume, double salariu,  String specializare) {
        super(nume, salariu);
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("specializare='").append(specializare).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
