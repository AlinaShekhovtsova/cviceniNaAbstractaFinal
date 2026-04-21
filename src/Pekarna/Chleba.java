package Pekarna;

public class Chleba extends Pecivo{
    private double hmotost;
    private String mouka;

    public Chleba(String nazev, int cena, double vyzivoveUdaje, int posyp, double hmotost, String mouka) {
        super(nazev, cena, vyzivoveUdaje);
        this.hmotost = hmotost;
        this.mouka = mouka;
    }

    @Override
    void popis(){

    }

    public double getHmotost() {
        return hmotost;
    }

    public void setHmotost(double hmotost) {
        this.hmotost = hmotost;
    }

    public String getMouka() {
        return mouka;
    }

    public void setMouka(String mouka) {
        this.mouka = mouka;
    }
}
