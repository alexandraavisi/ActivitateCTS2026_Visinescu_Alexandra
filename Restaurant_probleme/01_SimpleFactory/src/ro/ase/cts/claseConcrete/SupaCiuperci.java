package ro.ase.cts.claseConcrete;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(double grame, double pret) {
        super(grame, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("O portie de supa de ciuperci cantareste ");
        builder.append(grame + " grame si costa ");
        builder.append(pret + " lei");
        System.out.println(builder);
    }
}
