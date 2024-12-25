package Übung_Exeptions.Uebung_1;

public class EmptyNameException extends RuntimeException {
  public EmptyNameException(String message) {
    super(message);
  }
}
