package Ukol2;

public class Drak extends PohadkovaPostava{
    public Drak(String jmeno, int vek) {
        super(jmeno, vek);
    }

    @Override
    void popis() {
        System.out.print("Jmeno: " + getJmeno());
        System.out.print("Vek: " + getVek());
        System.out.print("Skutecni vek: " + vekDraka(getVek()));
    }

    private int vekDraka(int vek){
        int skutecniVek = vek * 3;
        return skutecniVek;
    }
}
