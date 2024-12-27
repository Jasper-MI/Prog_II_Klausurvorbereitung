package Uebung_Interfaces_List_Hash.Uebung_1.Solution;

import Uebung_Interfaces_List_Hash.Uebung_1.Kunstwerk;

import java.util.ArrayList;
import java.util.List;

public class CreateList {



    public static void main(String[] args) {
            List<Kunstwerk> kunstwerke = new ArrayList<>();
//            List<Gemaelde> gemaelde = new ArrayList<>();
//            List<Fotografie> fotografien = new ArrayList<>();
//            List<Skulptur> skulpturen = new ArrayList<>();

            Skulptur zeus = new Skulptur("Zeus", "Griechen", 5000, "Marmor");
            kunstwerke.add(zeus);

            Fotografie rhein2 = new Fotografie("Rhein 2", "Andreas Gursky", 20000000, 2009);
            kunstwerke.add(rhein2);

            Gemaelde derSchrei = new Gemaelde("Der Schrei", "Edvard Munch", 50000000, "Pastell auf Pappe");
            kunstwerke.add(derSchrei);

            sortListByType(kunstwerke);

    }

    public static void sortListByType(List<Kunstwerk> kunstwerke) {

        List<Gemaelde> gemaelde = new ArrayList<>();
        List<Fotografie> fotografien = new ArrayList<>();
        List<Skulptur> skulpturen = new ArrayList<>();

        for (int i = 0; i < kunstwerke.size(); i++) {

            if (kunstwerke.get(i) instanceof Gemaelde){
                gemaelde.add((Gemaelde) kunstwerke.get(i));
            } else if (kunstwerke.get(i) instanceof Fotografie) {
                fotografien.add((Fotografie) kunstwerke.get(i));
            } else if (kunstwerke.get(i) instanceof Skulptur) {
                skulpturen.add((Skulptur) kunstwerke.get(i));
            }
        }

        System.out.println(gemaelde);
        System.out.println(fotografien);
        System.out.println(skulpturen);
    }


}
