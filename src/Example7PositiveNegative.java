import java.util.Scanner;

public class Example7PositiveNegative {
    public static void main(String args[]){
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the Value of N : ");
        num=scanner.nextInt();

        if(num>0){
            System.out.println("No. is Positive");
        }
        else if(num<0){
            System.out.println("No. is Negative");
        }
        else{
            System.out.println("No. is 0");
        }
    }
}
