public class CurrencyConverter {
    int rupee=63;
    int dirham=3;
    int real=3;
    int chilean_peso = 595;
    int mexican_peso = 18;    
    int _yen = 107;
    int $australian = 2;

    void printCurrencies(){
        System.out.println("rupee :" +rupee);
        System.out.println("dirham: " +dirham);
        System.out.println("real:" +real);
        System.out.println("chilean_peso:" +chilean_peso);
        System.out.println("mexican_peso:" +mexican_peso);
        System.out.println("_yen:" +_yen);
        System.out.println("$australian:" +$australian);
        
    }
    public static void main(String[] args){
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
    
}
