class LCM {
    public static void main(String[] args){
        int num1=14;
        int num2=32;
        int lcm=1;
        for (int i = 1; i <= num1 || i <= num2; i++){
            if (num1 % i == 0 && num2 % i == 0){
                lcm=i;
            }
        }
        int result = (num1 * num2) / lcm;
        System.out.println ("The LCM: " + result);

        
    }
    
}
