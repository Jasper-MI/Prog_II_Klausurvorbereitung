package Uebung_Interfaces_List_Hash.Uebung_3;

public class Ausstellungsstueck {

    private String titel;
    private int alter;
    private String beschreibung;

    public Ausstellungsstueck(String titel, int alter, String beschreibung) {
        this.titel = titel;
        this.alter = alter;
        this.beschreibung = beschreibung;
    }

    public String getTitel() {
        return titel;
    }

    public int getAlter() {
        return alter;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    @Override
    public String toString() {
        return "Ausstellungsstueck{" +
                "titel='" + titel + '\'' +
                ", alter=" + alter +
                ", beschreibung='" + beschreibung + '\'' +
                '}';
    }

}
