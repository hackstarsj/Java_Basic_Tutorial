import java.util.Scanner;

public class Example3AreaOfSquare {
    public static void main(String args[]){
        int side;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Side of Square : ");
        side=scanner.nextInt();

        int area=side*side;

        System.out.println("Area of Square is : "+area);
    }
}
