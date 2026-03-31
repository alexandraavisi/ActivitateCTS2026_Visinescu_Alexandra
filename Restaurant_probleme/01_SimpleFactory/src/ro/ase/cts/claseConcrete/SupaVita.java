package ro.ase.cts.claseConcrete;

public class SupaVita extends Supa{
    public SupaVita(double grame, double pret) {
        super(grame, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("O portie de supa de vita cantareste ");
        builder.append(grame + " grame si costa ");
        builder.append(pret + " lei");
        System.out.println(builder);
    }
}
