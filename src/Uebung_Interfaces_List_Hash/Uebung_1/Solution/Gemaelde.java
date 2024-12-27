package Uebung_Interfaces_List_Hash.Uebung_1.Solution;

import Uebung_Interfaces_List_Hash.Uebung_1.Kunstwerk;

public class Gemaelde extends Kunstwerk implements Uebung_Interfaces_List_Hash.Uebung_1.Gemaelde {

    String maltechnik;

    public Gemaelde(String titel, String kuenstler, double preis, String maltechnik) {
        super(titel, kuenstler, preis);

        this.maltechnik = maltechnik;
    }

    public String getMaltechnik() {
        return maltechnik;
    }
}
