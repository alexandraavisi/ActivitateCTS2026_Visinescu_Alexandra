package ro.ase.cts.claseConcrete;

public class Secretar extends PersonalNonMedical {

    public Secretar(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Secretar: ").append(super.toString());
        System.out.println(sb);
    }
}
