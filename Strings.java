import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("String is:"+str);
        System.out.println("string methods");
        System.out.println("length:"+str.length());
        System.out.println("charAt:"+str.charAt(0));
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("substring :"+str.substring(1,4));
        System.out.println("indexof :"+str.indexOf("b"));
        System.out.println("equals:"+str.equals("sandeep"));
    }
}