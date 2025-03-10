public class LargestOfThreeNumbers {
    public static void main(String[] args){
        int a=60;
        int b=200;
        int c=100;
        if(a>b && a>c){
            System.out.println("a is largest number");
        }else if(a<b && b>c){
            System.out.println("b is largest");
        }else if(c>a && c>b){
            System.out.println("c is largest");
        }else{
            System.out.println("all are equal");
        }
        
    }
    
}
