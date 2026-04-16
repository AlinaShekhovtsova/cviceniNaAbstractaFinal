package Ukol2;

public class Drak extends PohadkovaPostava{
    public Drak(String jmeno, int vek) {
        super(jmeno, vek*3);
    }

    @Override
    void popis() {
        System.out.println("Jmeno: " + getJmeno());
        System.out.println("Skutecni vek: " + getVek());
    }




}
