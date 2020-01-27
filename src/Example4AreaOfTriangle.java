import java.util.Scanner;

public class Example4AreaOfTriangle {
    public static void main(String args[]){
        int base,height;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input Base of Triangle : ");
        base=scanner.nextInt();

        System.out.println("Input Height of Triangle : ");
        height=scanner.nextInt();

        double area=0.5*base*height;

        System.out.println("Area of Triangle is : "+area);
    }
}
