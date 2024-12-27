package Uebung_Interfaces_List_Hash.Uebung_1.Solution;

import Uebung_Interfaces_List_Hash.Uebung_1.Kunstwerk;

public class Fotografie extends Kunstwerk implements Uebung_Interfaces_List_Hash.Uebung_1.Fotografie {

    int aufnahmejahr;

    public Fotografie (String Titel, String kuenstler, double preis, int aufnahmejahr) {
        super(Titel, kuenstler, preis);

        this.aufnahmejahr = aufnahmejahr;
    }

    public int getAufnahmejahr(){
        return aufnahmejahr;
    }
}
