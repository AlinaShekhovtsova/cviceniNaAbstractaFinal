package Pekarna;

abstract public class Pecivo {
    private String nazev;
    private int cena;
    private double vyzivoveUdaje;
    abstract void popis();

    public Pecivo(String nazev, int cena, double vyzivoveUdaje) {
        this.nazev = nazev;
        this.cena = cena;
        this.vyzivoveUdaje = vyzivoveUdaje;
    }

    final void vratHodnoceni(){

    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double getVyzivoveUdaje() {
        return vyzivoveUdaje;
    }

    public void setVyzivoveUdaje(double vyzivoveUdaje) {
        this.vyzivoveUdaje = vyzivoveUdaje;
    }
}
