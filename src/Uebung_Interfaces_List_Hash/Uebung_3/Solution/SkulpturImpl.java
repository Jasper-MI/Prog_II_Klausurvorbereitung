package Uebung_Interfaces_List_Hash.Uebung_3.Solution;

import Uebung_Interfaces_List_Hash.Uebung_3.Ausstellungsstueck;

public class SkulpturImpl extends Ausstellungsstueck {

    double gewicht;

    public SkulpturImpl (String titel, int alter, String beschreibung, double gewicht ){
        super(titel, alter, beschreibung);
        this.gewicht = gewicht;
    }

    public double getGewicht(){
        return gewicht;
    }

}
