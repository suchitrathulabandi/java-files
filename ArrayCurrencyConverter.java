public class ArrayCurrencyConverter {
    double[] exchangerates={63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
    void printcurrency(){
        System.out.println("rupee:" +exchangerates[0]);
        System.out.println("dirham:" +exchangerates[1]);
        System.out.println("real:" +exchangerates[2]);
        System.out.println("chilean_peso:" +exchangerates[3]);
        System.out.println("mexican_peso:" +exchangerates[4]);
        System.out.println("_yen:" +exchangerates[5]);
        System.out.println("$australian:" +exchangerates[exchangerates.length-1]);


    }
    public static void main(String[] args){
        ArrayCurrencyConverter cc=new ArrayCurrencyConverter();
        cc.printcurrency();

    }
    
}
