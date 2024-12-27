package Uebung_Interfaces_List_Hash.Uebung_3.Solution;

import Uebung_Interfaces_List_Hash.Uebung_1.Solution.Gemaelde;
import Uebung_Interfaces_List_Hash.Uebung_3.Ausstellungsstueck;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Verwaltung {
    public List<Ausstellungsstueck> listOfAusstellungstuecke(List<GemaeldeImpl> gemaeldeList, List<SkulpturImpl> skulpturList, List<HistorischesArtefaktImpl> historischesArtefaktList){
        List<Ausstellungsstueck> completeList = new ArrayList<>();

        completeList.addAll(gemaeldeList);
        completeList.addAll(skulpturList);
        completeList.addAll(historischesArtefaktList);

        completeList.sort(Comparator.comparingInt(Ausstellungsstueck::getAlter));


        return completeList;
    }

}
