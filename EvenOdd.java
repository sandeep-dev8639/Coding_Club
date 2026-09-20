import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        //even or odd with and(&) operator
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if((a&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
