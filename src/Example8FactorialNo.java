import java.util.Scanner;

public class Example8FactorialNo {
    public static void main(String args[]){

        int num;
        int factorial=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input The No. ");
        num=scanner.nextInt();

        for(int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+num+" is : "+factorial);
    }
}
