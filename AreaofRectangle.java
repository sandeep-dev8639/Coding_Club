import java.util.*;
public class AreaofRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter breath of the rectangle:");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("Area of the rectangle is :"+area);
    }
}    

