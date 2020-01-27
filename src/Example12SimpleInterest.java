import java.util.Scanner;

public class Example12SimpleInterest {
    public static void main(String args[]){
        int p,t,r;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Principal : ");
        p=scanner.nextInt();
        System.out.println("Enter Rate : ");
        r=scanner.nextInt();
        System.out.println("Enter Time : ");
        t=scanner.nextInt();

        double si=(p*t*r)/100;

        System.out.println("SI is : "+si);
    }
}
