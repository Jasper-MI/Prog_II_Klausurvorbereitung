package Uebung_Exeptions.Uebung_2.Solution;

public class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(String message) {
        super(message);
    }
}
