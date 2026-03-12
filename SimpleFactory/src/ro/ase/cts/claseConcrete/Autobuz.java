package ro.ase.cts.claseConcrete;

public class Autobuz extends MijlocTransport {
    public Autobuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuzul cu numarul ")
                .append(super.numarInmatriculare)
                .append(" are ")
                .append(super.numarRoti)
                .append(" roti ");
        System.out.println(builder.toString());
    }
}
