import java.util.*;

public class Method {
    Scanner sc = new Scanner(System.in);
    void palindrom() {
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not");
        }
    }
    public static void main(String args[]) {
        Method md = new Method();
        md.palindrom();
    }
}