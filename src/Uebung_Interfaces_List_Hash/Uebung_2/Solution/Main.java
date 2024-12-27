package Uebung_Interfaces_List_Hash.Uebung_2.Solution;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek();

        Buch buch1 = new Buch("Der Name der Rose", "Umberto Eco", "978-3423123456");
        Buch buch2 = new Buch("1984", "George Orwell", "978-3548256789");
        Buch buch3 = new Buch("Der Name der Rose", "Umberto Eco", "978-3423123456"); // Duplikat
        Zeitschrift zeitschrift1 = new Zeitschrift("National Geographic", "1234-5678", "monatlich");
        Zeitschrift zeitschrift2 = new Zeitschrift("Time", "8765-4321", "wöchentlich");
        Zeitschrift zeitschrift3 = new Zeitschrift("National Geographic", "1234-5678", "monatlich"); // Duplikat

        bibliothek.addPublikation(buch1);
        bibliothek.addPublikation(buch2);
        bibliothek.addPublikation(buch3);
        bibliothek.addPublikation(zeitschrift1);
        bibliothek.addPublikation(zeitschrift2);
        bibliothek.addPublikation(zeitschrift3);

        System.out.println("Suche Buch mit dem Titel '1984': " + bibliothek.searchPublikation("1984"));
        System.out.println("Suche Zeitschrift mit dem Titel 'Time': " + bibliothek.searchPublikation("Time"));

        bibliothek.deletePublikation("1984");

        List<Object> listePublikationen = bibliothek.listAllPublikationen();
        System.out.println("\nPublikationen:");
        listePublikationen.forEach(System.out::println);
    }
}
