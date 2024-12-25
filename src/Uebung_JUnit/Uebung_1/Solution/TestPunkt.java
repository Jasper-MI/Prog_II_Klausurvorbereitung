package Uebung_JUnit.Uebung_1.Solution;

import Uebung_JUnit.Uebung_1.Punkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPunkt {

    private Punkt testPunkt;

    @BeforeEach
    public void setUp() {
        testPunkt = new Punkt(6,5);
    }

    @Test
    public void testCreateClass(){
        try{
            Punkt punkt = new Punkt(8,9);
            System.out.println("Punkt created at x: " + punkt.getX() + " and y: " + punkt.getY());
        } catch (Exception e){
            System.out.println(e.toString());
        }

    }

    @Test
    public void testContructor() {

        assertEquals(6, testPunkt.getX());
        assertEquals(5, testPunkt.getY());
    }

    @Test
    public void testVerschiebe() {

        testPunkt.verschiebe(10, 20);

        assertEquals(16, testPunkt.getX());
        assertEquals(25, testPunkt.getY());
    }

    @Test
    public void testVerschiebe2() {

        testPunkt.verschiebe(-10, -20);

        assertEquals(-4, testPunkt.getX());
        assertEquals(-15, testPunkt.getY());
    }
}
