package Übung_Exeptions.Uebung_2;

public class InvalidPriceException extends RuntimeException {
  public InvalidPriceException(String message) {
    super(message);
  }
}
