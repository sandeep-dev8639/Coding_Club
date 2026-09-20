public class Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //arthmatic operator
        System.out.println("arthmatic operator");
        System.out.println("******************");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("--------------------------");
        //relational operator
        System.out.println("relational operator");
        System.out.println("*******************");
        int i=30;
        int j=40;
        System.out.println(i>j);
        System.out.println(i>=j);
        System.out.println(i<j);
        System.out.println(i<=j);
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println("--------------------------");
        //unary operator
        System.out.println("unary operator");
        System.out.println("**************");
        int x=10;
        System.out.println(+x);
        System.out.println(-x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println("--------------------------");
        //logical operator
        System.out.println("logical operator");
        System.out.println("****************");
        int marks = 15;
        if(marks>=75 && marks<=100){
            System.out.println("A grade");
        }
        else if(marks>=50 || marks<=75){
            System.out.println("B grade");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("--------------------------");
    }
}
