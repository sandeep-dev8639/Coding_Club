import java.util.*;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("no of test cases:");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String str = sc.nextLine();
            String rev ="";
            for(i=str.length()-1;i>0;i--){
                rev=rev+str.charAt(i);
            }
            if(str.equals(rev)){
            System.out.println("palindrom");
            }
            else{
                System.out.println("not");
            }
        }
    }
}
