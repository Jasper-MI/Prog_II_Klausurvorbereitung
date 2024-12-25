package Uebung_Exeptions.Uebung_1.Solution;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException(String message) {
        super(message);
    }
}
