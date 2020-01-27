import java.util.Scanner;

public class Example1CheckWhichNoGreater {
    public static void main(String args[]){
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the Value of A : ");
        a=scanner.nextInt();

        System.out.println("Input the Value of B : ");
        b=scanner.nextInt();

        System.out.println("Input the Value of C : ");
        c=scanner.nextInt();

        if(a>b && a>c){
            System.out.println("A is Greater ");
        }
        else if(b>c && b>a){
            System.out.println("B is Greater");
        }
        else{
            System.out.println("C is Greater");
        }
    }
}
