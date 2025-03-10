public class OccurenceOfCharector {
    public static void main(String[] args){
        String str="Hello! good morning, how are you";
        char ch='o';
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch)
            count++;
        }
        System.out.println("Occurrences of "+ch+" are " +count);
   

    }
    
}
