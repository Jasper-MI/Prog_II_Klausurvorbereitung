package Uebung_Interfaces_List_Hash.Uebung_2.Solution;

import java.util.*;

public class Bibliothek {

    private Map<String, Object> publikationen = new HashMap<>();


    public void addPublikation(Object publikation) {
        if (publikation instanceof Buch) {
            publikationen.put(((Buch) publikation).getTitel(), publikation);
        } else if (publikation instanceof Zeitschrift) {
            publikationen.put(((Zeitschrift) publikation).getTitel(), publikation);
        } else {
            System.out.println("Object ist kein Buch oder Zeitschrift!");
        }
    }


    public Object searchPublikation(String titel) {
        return publikationen.get(titel);
    }

    public void deletePublikation(String titel) {
        publikationen.remove(titel);
    }

    public List<Object> listAllPublikationen() {

        List<Object> listPublikationen = new ArrayList<>();

        for (Object publikation : publikationen.values()) {
            if(publikation instanceof Buch) {
                listPublikationen.add(publikation);
            }
        }

        for (Object publikation : publikationen.values()) {
            if(publikation instanceof Zeitschrift) {
                listPublikationen.add(publikation);
            }
        }

        return listPublikationen;

    }

}
