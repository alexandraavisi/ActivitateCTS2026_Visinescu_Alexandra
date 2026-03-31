package ro.ase.cts.claseConcrete;

public class SupaLegume extends Supa {
    public SupaLegume(double grame, double pret) {
        super(grame, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("O portie de supa de legume cantareste ");
        builder.append(grame + " grame si costa ");
        builder.append(pret + " lei");
        System.out.println(builder);
    }
}
