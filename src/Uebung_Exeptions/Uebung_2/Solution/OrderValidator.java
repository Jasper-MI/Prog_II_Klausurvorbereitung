package Uebung_Exeptions.Uebung_2.Solution;

public class OrderValidator {


    public static void validateOrder (String id, String quantity, String price) throws InvalidProductIDException, InvalidQuantityException, InvalidPriceException {
        int intID = Integer.parseInt(id);
        int intQuantity = Integer.parseInt(quantity);
        int intPrice = Integer.parseInt(price);

        if(intID < 0){
            throw new InvalidProductIDException("Product-ID has to be positiv");
        } else if(intQuantity < 0){
            throw new InvalidQuantityException("Quantity has to be positiv");
        } else if (intPrice < 0){
            throw new InvalidPriceException("Price has to be positiv");
        }

    }
}
