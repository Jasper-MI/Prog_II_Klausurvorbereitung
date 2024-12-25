package Uebung_Exeptions.Uebung_1.Solution;

public class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}
