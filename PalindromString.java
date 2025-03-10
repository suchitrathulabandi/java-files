public class PalindromString {
    public static void main(String[] args){
        String str="kook";
        String reverse="";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    
}
