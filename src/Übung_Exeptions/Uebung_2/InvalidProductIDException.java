package Übung_Exeptions.Uebung_2;

public class InvalidProductIDException extends RuntimeException {
  public InvalidProductIDException(String message) {
    super(message);
  }
}
