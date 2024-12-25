package Uebung_Exeptions.Uebung_2.Solution;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.fail;


public class TestOrder {

    @Test
    public void test1(){


        try {
            OrderValidator.validateOrder("1234", "16", "50");
            OrderValidator.validateOrder("-12", "16", "50");
            OrderValidator.validateOrder("1234", "-1", "50");
            OrderValidator.validateOrder("1234", "16", "-6");

        } catch (InvalidProductIDException e) {
            fail(e.toString());
        } catch (InvalidQuantityException e) {
            fail(e.toString());
        } catch (InvalidPriceException e) {
            fail(e.toString());
        }
    }
    

}
