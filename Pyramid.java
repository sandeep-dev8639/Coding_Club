public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // for pyramid 
        for(int i=0;i<=5;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for inverted pyramid
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
