package Pekarna;

abstract public class Pecivo {
    private String nazev;
    private int cena;
    private double vyzivoveUdaje;

    public Pecivo(String nazev, int cena, double vyzivoveUdaje) {
        this.nazev = nazev;
        this.cena = cena;
        this.vyzivoveUdaje = vyzivoveUdaje;
    }

    abstract void popis();
}
