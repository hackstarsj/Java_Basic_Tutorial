import java.util.Scanner;

public class Example9SwapValue {
    public static void main(String args[]){
        int a,b;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the Value of A : ");
        a=scanner.nextInt();

        System.out.println("Input the Value of B : ");
        b=scanner.nextInt();

        System.out.println("Value of A Before Swapping : "+a);
        System.out.println("Value of B Before Swapping : "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Value of A After Swapping : "+a);
        System.out.println("Value of B After Swapping : "+b);


    }
}
