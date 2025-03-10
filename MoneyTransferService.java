public class MoneyTransferService {
    MoneyTransferService Service1=new MoneyTransferService();
    double computeTransferAmount(int countryIndex, double amount) {
        return Service1.computeTransferAmount(countryIndex, amount);
    }
    double computeTransferFee(int countryIndex, double amount) {
        double transferAmount = computeTransferAmount(countryIndex, amount);
        double transferFee = transferAmount * 0.02;
        return transferFee;
   }
   public static void main(String[] args) {
    MoneyTransferService Service2 = new MoneyTransferService();
    double transferAmount =Service2.computeTransferAmount(0, 1000);
    double transferFee = Service2.computeTransferFee(0, 1000);

    System.out.println("transferAmount: " + transferAmount);
    System.out.println("transferFee: " + transferFee);
    }	
    
}
