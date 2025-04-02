public class ReverseAnumber {
    public static void main(String[] args){
        int n=123;
        int reverse=0;
        int remainder;
        while(n!=0){
            remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println("the reverse of a number is:" +reverse);
    }
    
}
