import java.util.Scanner;

public class ArmStrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int cube = 0;
        while(num != 0) {
            int digit = num % 10;
            cube = cube + (digit*digit*digit);
            num = num / 10;
        }
        if(org == cube) {
            System.out.println("ArmStrong");
        }
        else {
            System.out.println("Not ArmStrong");
        }
    }
}
