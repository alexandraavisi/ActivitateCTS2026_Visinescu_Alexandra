package ro.ase.cts.claseConcrete;

public class Registrator extends  PersonalNonMedical {

    public Registrator(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registrator ").append(super.toString());
        System.out.println(sb);
    }
}
