package Übung_Exeptions.Uebung_1;

public class InvalidNameExpetion extends RuntimeException {
  public InvalidNameExpetion(String message) {
    super(message);
  }
}
