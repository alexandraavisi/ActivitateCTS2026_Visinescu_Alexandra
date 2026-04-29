package ase.ro.cts.clase;

public class Salon {
    private boolean patLiber[] = new boolean[4];

    public Salon() {
        patLiber[1] = true;
        patLiber[3] = true;
    }

    public int getPatLiber() {
        for (int i = 0; i < patLiber.length; i++) {
            if (patLiber[i]) {
                return i;
            }
        }

        return -1;
    }

    public void ocupaPat(int indexPat) {
        this.patLiber[indexPat] = false;
    }
}
