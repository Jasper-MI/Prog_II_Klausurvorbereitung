package Uebung_Exeptions.Uebung_1.Solution;

public class UserDataValidator {

    String prename;
    String surname;
    int age;

    public UserDataValidator (String userData) {

        String [] userDataArray = userData.split(";");

        this.prename = userDataArray[0];
        this.surname = userDataArray[1];
        this.age = Integer.parseInt(userDataArray[2]);
    }


    public static void validateUserData (String prename, String surname, String age) throws EmptyNameException, InvalidNameException, InvalidAgeException{

        int intAge = Integer.parseInt(age);

        if(prename.isEmpty() || surname.isEmpty()) {
            throw new EmptyNameException("Name is empty");
        } else if (!prename.matches("[a-zA-Z]+") || !surname.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Name contains a character other then a-zA-Z");
        } else if (intAge < 0) {
            throw new InvalidAgeException("Age is negative");
        }
    }
}
