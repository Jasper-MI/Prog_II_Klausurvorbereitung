package Übung_Exeptions.Uebung_2;

public class InvalidQuantityException extends RuntimeException {
  public InvalidQuantityException(String message) {
    super(message);
  }
}
