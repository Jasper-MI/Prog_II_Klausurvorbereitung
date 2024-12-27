package Uebung_Interfaces_List_Hash.Uebung_1;

public class Kunstwerk {

    private String titel;
    private String kuenstler;
    private double preis;

    public Kunstwerk(String titel, String kuenstler, double preis) {
        this.titel = titel;
        this.kuenstler = kuenstler;
        this.preis = preis;
    }

    public String getTitel() {
        return titel;
    }

    public String getKuenstler() {
        return kuenstler;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Kunstwerk{" +
                "titel='" + titel + '\'' +
                ", kuenstler='" + kuenstler + '\'' +
                ", preis=" + preis +
                '}';
    }
}

