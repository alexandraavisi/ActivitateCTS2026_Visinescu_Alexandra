package ro.ase.cts.claseConcrete;

public class Brancardier extends PersonalMedical {

    public Brancardier(String nume, double salariu, String specializare) {
        super(nume, salariu, specializare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brancardier: ").append(super.toString());
        System.out.println(sb);
    }
}
