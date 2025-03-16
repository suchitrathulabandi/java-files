public class RestorentMenuBillGenerator {
    static int ordernumber=1000;
    static double seniorDiscount=5.0;
    boolean SeniorCitizen=false;
    double orderAmount=0.0;
    int foodChoice;
    int drinkChoice;
    int dessertChoice;
    String cuponCode;

    public RestorentMenuBillGenerator(int foodChoice, int drinkChoice, int dessertChoice, String cuponCode, boolean SeniorCitizen){
        this.foodChoice=foodChoice;
        this.drinkChoice=drinkChoice;
        this.dessertChoice=dessertChoice;
        this.cuponCode=cuponCode;
        this.SeniorCitizen=SeniorCitizen;

        ordernumber=ordernumber+1;

    }
    public RestorentMenuBillGenerator(int foodChoice, int drinkChoice, int dessertChoice, String cuponCode){
        this(foodChoice, drinkChoice, dessertChoice, cuponCode, false);

    }
    public double generateOrderBill(){
        double foodPrice=Menu.getMenuItemPrice(foodChoice);
        double drinkPrice=Menu.getMenuItemPrice(drinkChoice);
        double dessertPrice=Menu.getMenuItemPrice(dessertChoice);
        
        orderAmount=foodPrice+drinkPrice+dessertPrice;

        if(orderAmount>100){
            orderAmount=orderAmount-Menu.applyCupon(cuponCode);

        }
        if(SeniorCitizen){
            orderAmount=orderAmount-seniorDiscount;

        }
        return orderAmount;
    }
    public static void main(String[] args){
        RestorentMenuBillGenerator order1=new RestorentMenuBillGenerator(1,2,3,"SAVE4");
        double billAmount1=order1.generateOrderBill();
        System.out.println("order number:" +ordernumber + "bill amount:" +billAmount1);

        RestorentMenuBillGenerator order2=new RestorentMenuBillGenerator(1,2,3,"HAPPYHOUR",true);
        double billAmount2=order2.generateOrderBill();
        System.out.println("order number:" +ordernumber + "bill Amount:" +billAmount2);

        RestorentMenuBillGenerator order3=new RestorentMenuBillGenerator(4,5,0,"SPECIAL3OFF",true);
        double billAmount3=order3.generateOrderBill();
        System.out.println("order number:" +ordernumber + "bill Amount:" +billAmount3);


    }
 
}
class Menu{
    public static double getMenuItemPrice(int choice){
        double itemPrice=0.0;

        switch(choice){
            case 0: itemPrice=0.0;
                    break;
            case 1: itemPrice=12.0;
                    break;
            case 2: itemPrice=8.0;
                    break;
            case 3: itemPrice=10.0;
                    break;
            case 4: itemPrice=15.0;
                    break;
            case 5: itemPrice=7.0;
                    break;
            case 6: itemPrice=9.0;
                    break;
            case 7: itemPrice=3.0;
                    break;
            case 8: itemPrice=3.0;
                    break;
            case 9: itemPrice=5.0;
                    break;
            case 10: itemPrice=6.0;
                    break;
            default: itemPrice=0.0;
                    break;
        }
        return itemPrice;

    }
    public static double applyCupon(String cuponCode){
        double discount=0.0;

        switch(cuponCode){
            case "SAVE4": discount = 4.0;
			    break;
			case "HAPPYHOUR": discount = 5.0;
			    break;
			case "SPECIAL3OFF": discount = 3.0;
			    break;
			case "SUNDAY2OFF": discount = 2.0;
			    break;
			case "GOODSTUDENT": discount = 2.0;
			    break;
			default: discount = 0.0;
			    break;
        }
        return discount;
    }
}


