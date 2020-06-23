package Functions;

public class Dynamic {
    public static double calculateTotalMealPrice (double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is worth " + result);
        return result;
    }
    public static void main(String[] args) {
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);
        double groupTotalMealPrice = calculateTotalMealPrice(25, .18, .08);
        System.out.println("Group: " + groupTotalMealPrice);
    }
}