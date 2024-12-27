package Uebung_Interfaces_List_Hash.Uebung_3.Solution;

import Uebung_Interfaces_List_Hash.Uebung_3.Ausstellungsstueck;

public class HistorischesArtefaktImpl extends Ausstellungsstueck {

    String fundort;

    public HistorischesArtefaktImpl (String titel, int alter, String beschreibung, String fundort){
        super(titel, alter, beschreibung);
        this.fundort = fundort;
    }

    public String getFundort(){
        return fundort;
    }
}
