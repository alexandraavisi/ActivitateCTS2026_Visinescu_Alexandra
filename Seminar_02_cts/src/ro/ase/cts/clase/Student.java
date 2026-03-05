package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static int VALOARE_FINANTARE_STUDENT = 20;



    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    public static int getValoareFinantareStudent() {
        return VALOARE_FINANTARE_STUDENT;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append(super.toString());
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", an_studii=").append(an_studii);
        sb.append('}');
        return sb.toString();
    }

    public static void setValoareFinantareStudent(int valoareFinantareStudent) {
        VALOARE_FINANTARE_STUDENT = valoareFinantareStudent;
    }

    public Student() {
        super();

    }

    @Override
    public void afiseazaFinantare() {
        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste "+ getValoareFinantareStudent() +" Euro/zi in proiect.");

    }

}

