package Pekarna;

public class Rohlik extends Pecivo{
    private int posyp;

    public Rohlik(String nazev, int cena, double vyzivoveUdaje, int posyp) {
        super(nazev, cena, vyzivoveUdaje);
        this.posyp = posyp;


    }

    @Override
    void popis(){
        System.out.println("Neco");
    }
}
