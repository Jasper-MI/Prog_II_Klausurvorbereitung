package Uebung_Interfaces_List_Hash.Uebung_3.Solution;

import Uebung_Interfaces_List_Hash.Uebung_3.Ausstellungsstueck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GemaeldeImpl> gemaeldeList = new ArrayList<>();

        gemaeldeList.add(new GemaeldeImpl("Mona Lisa", 500, "Berühmtes Portrait", "Leonardo da Vinci"));
        gemaeldeList.add(new GemaeldeImpl("Sternennacht", 133, "Ölgemälde", "Vincent van Gogh"));


        List<SkulpturImpl> skulpturList = new ArrayList<>();

        skulpturList.add(new SkulpturImpl("David", 520, "Skulptur eines Mannes", 6000));


        List<HistorischesArtefaktImpl> historischesArtefaktList = new ArrayList<>();

        historischesArtefaktList.add(new HistorischesArtefaktImpl("Pharaonenmaske", 3000, "Goldene Maske", "Ägypten"));


        Verwaltung verwaltung = new Verwaltung();

        //System.out.println(verwaltung.listOfAusstellungstuecke(gemaeldeList, skulpturList, historischesArtefaktList));
        verwaltung.listOfAusstellungstuecke(gemaeldeList, skulpturList, historischesArtefaktList).forEach(System.out::println);


    }
}
