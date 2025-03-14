public class AmusementParkTicketPriceCalculator {
    public static double calculateTicketPrice(int age, boolean hasStudentId, boolean speedPass, boolean foodPass) {
        double price = 0.0;
 
        if (age <= 5) {
            return 0.0;
        } else if (age > 5 && age <= 12) {
            price = 50.0;
        } else if (age > 12 && age <= 21 && hasStudentId) {
            price = 75.0;
        } else if (age > 12 && age <= 21) {
            price = 100.0;
        } else if (age > 21 && age <= 55) {
            price = 150.0;
        } else if (age > 55) {
            price = 25.0;
        }
 
        if (speedPass) {
            price += 200.0;
        }
        
        if (foodPass) {
            price += 400.0;
        }
 
        return price;
    }
 
    public static void main(String[] args) {
    
        System.out.println(calculateTicketPrice(10, false, false, false));
        System.out.println(calculateTicketPrice(18, true, false, false));
        System.out.println(calculateTicketPrice(18, false, true, true)); 
        System.out.println(calculateTicketPrice(60, false, false, false));
        System.out.println(calculateTicketPrice(4, false, true, true)); 
        System.out.println(calculateTicketPrice(5, false, false, false)); 
    }


}