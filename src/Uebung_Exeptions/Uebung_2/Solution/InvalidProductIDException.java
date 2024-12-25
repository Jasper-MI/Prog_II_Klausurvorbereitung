package Uebung_Exeptions.Uebung_2.Solution;

public class InvalidProductIDException extends RuntimeException {
    public InvalidProductIDException(String message) {
        super(message);
    }
}
