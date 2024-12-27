package Uebung_Interfaces_List_Hash.Uebung_2.Solution;

public class Zeitschrift {

    private String titel;
    private String issn;
    private String erscheinungsfrequenz;

    public Zeitschrift(String titel, String issn, String erscheinungsfrequenz) {
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


    public boolean equals(Object object){
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (object instanceof Zeitschrift) {
            Zeitschrift newZeitschrift = (Zeitschrift) object;

            if (issn.equals(newZeitschrift.getIssn())){
                return true;
            }
        }

        return false;
    }
}
