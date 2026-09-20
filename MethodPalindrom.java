import java.util.*;
public class MethodPalindrom {
    Scanner sc = new Scanner(System.in);
    void palindrome() {
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while(num > 0) {
            int digit = num % 10;  
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(org == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String args[]) {
        MethodPalindrom md = new MethodPalindrom();
        md.palindrome();
    }
}