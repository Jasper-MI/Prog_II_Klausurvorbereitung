package Uebung_Interfaces_List_Hash.Uebung_2.Solution;

import java.util.Objects;

public class Buch {

    private String titel;
    private String autor;
    private String isbn;

    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public boolean equals(Object object){
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (object instanceof Buch) {
            Buch newBook = (Buch) object;

            if (isbn.equals(newBook.getIsbn())){
                return true;
            }
        }

        return false;
    }

}
