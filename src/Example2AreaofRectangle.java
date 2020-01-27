import java.util.Scanner;

public class Example2AreaofRectangle {
    public static void main(String args[]){
        int length,breadth;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Length of Rectangle : ");
        length=scanner.nextInt();

        System.out.println("Input Breadth of Rectangle : ");
        breadth=scanner.nextInt();

        int area=length*breadth;

        System.out.println("Area of Rectangle is  : "+area);
    }
}
