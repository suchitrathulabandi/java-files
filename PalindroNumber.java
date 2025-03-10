public class PalindroNumber {
    public static void main(String[] args){
        int num=2233221;
        int reverse=0;
        int remainder;
        int originalnum=num;
        while(num!=0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        if(originalnum==reverse){
            System.out.println("given number is palindrom");
        }else{
            System.out.println("not a palindrom");
        }

    }
    
}
