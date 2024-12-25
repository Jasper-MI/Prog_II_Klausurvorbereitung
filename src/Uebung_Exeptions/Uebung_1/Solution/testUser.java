package Uebung_Exeptions.Uebung_1.Solution;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class testUser {


    @Test
    public void test1(){
        String prename = "Tom";
        String surname = "Mueller";
        String age = "12";

        try {
            UserDataValidator.validateUserData(prename, surname, age);
        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test2(){
        String prename = "";
        String surname = "Mueller";
        String age = "12";

        try {
            UserDataValidator.validateUserData(prename, surname, age);
        } catch (EmptyNameException e) {
            fail(e.toString());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3(){
        String prename = "Tom";
        String surname = "Mue+ller";
        String age = "12";

        try {
            UserDataValidator.validateUserData(prename, surname, age);
        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNameException e) {
            fail(e.toString());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test4(){
        String prename = "Tom";
        String surname = "Mueller";
        String age = "-5";

        try {
            UserDataValidator.validateUserData(prename, surname, age);
        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            fail(e.toString());
        }
    }

}
