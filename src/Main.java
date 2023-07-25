import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String s = "Dad";
        String reverse = "";
        for(int i = s.length()-1; i>=0; i--) {
            reverse += s.charAt(i);
            }

        boolean palindrome = true;
        for(int i=0; i<=s.length()-1; i++) {
            if(s.toLowerCase().charAt(i) != reverse.toLowerCase().charAt(i)) {
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("The word \"" + s + "\" is palindrome");
        } else {
            System.out.println("The Word \"" + s +  "\" not a palindrome");
        }


    }
}