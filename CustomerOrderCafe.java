public class CustomerOrderCafe {
    int ordernumber=1;
    double price=20.0;
    double seniordiscount=2.0;
    boolean oldcitizen;
    int nextordernumber;
    int quantity;

    void generateOrderBills(){
        ordernumber=ordernumber+1;
        price=price*quantity;
        if (oldcitizen){
            price = price - seniordiscount;
        }
        nextordernumber=ordernumber+1;
        System.out.println("\nordernumber: " +ordernumber);
        System.out.println("quantity: " +quantity);
        System.out.println("price: " +price);
        System.out.println("senoirdiscount:" +seniordiscount);
        System.out.println("oldcitizen: " +oldcitizen);
        System.out.println("nextordernumber: " +nextordernumber);
    }
    public static void main(String[] args){
        CustomerOrderCafe order1=new CustomerOrderCafe();
        order1.ordernumber=0;
        order1.quantity=2;
        order1.price=20.0;
        order1.seniordiscount=2.0;
        order1.oldcitizen=false;
        order1.generateOrderBills();

        CustomerOrderCafe order2=new CustomerOrderCafe();
        order2.ordernumber=1;
        order2.quantity=1;
        order2.price=20.0;
        order2.seniordiscount=2.0;
        order2.oldcitizen=false;
        order2.generateOrderBills();

        CustomerOrderCafe order3=new CustomerOrderCafe();
        order3.ordernumber=2;
        order3.quantity=1;
        order3.price=20.0;
        order3.seniordiscount=2.0;
        order3.oldcitizen=true;
        order3.generateOrderBills();
    }
    
}
