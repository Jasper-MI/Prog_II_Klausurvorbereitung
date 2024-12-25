package Uebung_Exeptions.Uebung_2.Solution;

public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {
        super(message);
    }
}
