package Uebung_Interfaces_List_Hash.Uebung_1.Solution;

import Uebung_Interfaces_List_Hash.Uebung_1.Kunstwerk;

public class Skulptur extends Kunstwerk implements Uebung_Interfaces_List_Hash.Uebung_1.Skulptur {

    String material;

    public Skulptur (String titel, String kuenstler, double preis, String material) {
        super(titel, kuenstler, preis);

        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


}
