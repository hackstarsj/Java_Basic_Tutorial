import java.util.Scanner;

public class IfElseBooleanExample {
    public static void main(String args[]){
        //boolean data
        boolean is_data=true;
        boolean is_data_2=false;
        boolean is_greater=2>3;

        if(is_data){
            System.out.println("This is True Statement");
        }

        if(is_data_2){
            System.out.println("This is True Statement");
        }
        else{
            System.out.println("This is False Statement");
        }

        System.out.println("Value of isgreater : "+is_greater);
        if(is_greater){
            System.out.println("2 is Greater Than 3");
        }
        else{
            System.out.println("2 is Smaller Than 3");
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Value of a : ");
        int a=scanner.nextInt();
        System.out.println("Input Value of b : ");
        int b=scanner.nextInt();

        //if else if else
        if(a>b){
            System.out.println("A is Greater Then B");
        }
        else if(a==b){
            System.out.println("A is Equal to B");
        }
        else{
            System.out.println("A is Smaller Than B");
        }

        System.out.println("Input Value of a : ");
         a=scanner.nextInt();
        System.out.println("Input Value of b : ");
         b=scanner.nextInt();
        System.out.println("Input Value of c : ");
        int c=scanner.nextInt();

        //if else if else program
        if(a>b && a>c)
        {
            System.out.println("A is Greater Then B and C");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greater Then A and C");
        }
        else{
            System.out.println("C is Greater then A and B");
        }

        //equal to operator
        if(a==b){
            System.out.println("A is Equal to B");
        }

        //greater than operator
        if(a>b){
            System.out.println("A is Greater then B");
        }

        //smaller than operator
        if(a<b){
            System.out.println("A is Smaller Then B");
        }

        //not equal to operator
        if(a!=b){
            System.out.println("A is Not Equal to B");
        }

        //greater then equal to operator
        if(a>=b){
            System.out.println("A is Greater Then Equal to B");
        }

        //smaller then equal to operator
        if(a<=b){
            System.out.println("A is Smaller Then Equal to B");
        }

        //Odd Even Program
        System.out.println("Input a Number : ");
        int num=scanner.nextInt();

        //odd even program
        if(num%2==0){
            System.out.println("No. is Even");
        }
        else{
            System.out.println("No. is Odd");
        }

        //nested if else statement
        if(a>b && a>c){
            System.out.println("A is Greater Than B and C");
        }
        else{
            if(b>a && b>c){
                System.out.println("B is Greater then A and C");
            }
            else{
                System.out.println("C is Greater then A and B");
            }
        }

    }
}
