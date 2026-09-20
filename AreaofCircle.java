import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 3.14f;
        double r = sc.nextInt();
        double area = a*(r*r);
        System.out.println("Area of circle:"+area);
    }
}
