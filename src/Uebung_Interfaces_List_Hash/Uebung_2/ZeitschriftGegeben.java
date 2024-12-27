package Uebung_Interfaces_List_Hash.Uebung_2;

public class ZeitschriftGegeben {

    private String titel;
    private String issn;
    private String erscheinungsfrequenz;

    public ZeitschriftGegeben(String titel, String issn, String erscheinungsfrequenz) {
        this.titel = titel;
        this.issn = issn;
        this.erscheinungsfrequenz = erscheinungsfrequenz;
    }

    public String getTitel() {
        return titel;
    }

    public String getIssn() {
        return issn;
    }

    public String getErscheinungsfrequenz() {
        return erscheinungsfrequenz;
    }

    @Override
    public String toString() {
        return "Zeitschrift{" +
                "titel='" + titel + '\'' +
                ", issn='" + issn + '\'' +
                ", erscheinungsfrequenz='" + erscheinungsfrequenz + '\'' +
                '}';
    }

}
