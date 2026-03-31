package ro.ase.cts.claseConcrete;

public class Medic extends PersonalMedical{

    public Medic(String nume, double salariu, String specializare) {
        super(nume, salariu, specializare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medic ").append(super.toString());
        System.out.println(sb);
    }
}
