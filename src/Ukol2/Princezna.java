package Ukol2;

public class Princezna extends PohadkovaPostava{
    String prijmeni;

    public Princezna(String jmeno, String prijmeni, int vek) {
        super(jmeno, vek);
        this.prijmeni = prijmeni;
    }

    @Override
    void popis() {
        System.out.println("Jmeno: " + getJmeno());
        System.out.println("Prijmeni: " + getPrijmeni());
        System.out.println("Vek: " + getVek());
    }

    private void zmenJmeno(String jmeno) {

    }

    private void zmenJmeno(String jmeno, String prijmeni) {

    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
}
