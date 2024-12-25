package Übung_Exeptions.Uebung_1;

public class InvalidAgeExpetion extends RuntimeException {
  public InvalidAgeExpetion(String message) {
    super(message);
  }
}
