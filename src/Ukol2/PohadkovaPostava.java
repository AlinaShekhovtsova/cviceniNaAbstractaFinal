package Ukol2;

public abstract class PohadkovaPostava {
    abstract void popis();
    private String jmeno;
    private int vek;

    public PohadkovaPostava(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
