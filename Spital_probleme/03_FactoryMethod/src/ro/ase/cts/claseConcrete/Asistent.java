package ro.ase.cts.claseConcrete;

public class Asistent extends PersonalMedical{

    public Asistent(String nume, double salariu, String specializare) {
        super(nume, salariu, specializare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistent ").append(super.toString());
        System.out.println(sb);
    }
}
