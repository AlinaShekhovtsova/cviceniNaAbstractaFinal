package Ukol2;

public class Princezna extends PohadkovaPostava{
    public Princezna(String jmeno, int vek) {
        super(jmeno, vek);
    }

    @Override
    void popis() {
        System.out.print("Jmeno: " + getJmeno());
        System.out.print("Vek: " + getVek());
    }

    private void zmenJmeno(String jmeno) {

    }

    private void zmenJmeno(String jmeno, String prijmeni) {

    }
}
