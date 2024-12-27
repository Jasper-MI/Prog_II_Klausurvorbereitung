package Uebung_Interfaces_List_Hash.Uebung_3.Solution;

import Uebung_Interfaces_List_Hash.Uebung_3.Ausstellungsstueck;

public class GemaeldeImpl extends Ausstellungsstueck {

    String kuenstler;

    public GemaeldeImpl (String titel, int alter, String beschreibung, String kuenstler){
        super(titel, alter, beschreibung);
        this.kuenstler = kuenstler;
    }

    public String getKuenstler(){
        return kuenstler;
    }

}
