package Pekarna;

public class Croissant extends Pecivo{
    private String napln;

    public Croissant(String nazev, int cena, double vyzivoveUdaje, String napln){
        super(nazev, cena, vyzivoveUdaje);
        this.napln = napln;
    }

    @Override
    void popis(){

    }

    public String getNapln() {
        return napln;
    }

    public void setNapln(String napln) {
        this.napln = napln;
    }
}
