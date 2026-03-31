package ro.ase.cts.claseConcrete;

public abstract class PersonalNonMedical extends PersonalSpital {

    public PersonalNonMedical(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
