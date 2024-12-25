package Uebung_Exeptions.Uebung_1.Solution;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
