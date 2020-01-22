import java.util.Scanner;

public class HelloWorld {

    public static void main(String args[]){
        //Integer Data
        int integerdata=10;
        //Char Data
        char char_data=65;
        //char data
        char char_data1=68;
        //Double Data
        double double_data=100.0;
        //float data
        float float_data=10f;
        //String Data
        String string_data="This is String Data";

        System.out.println("Integer Data : "+integerdata);
        System.out.println("Double Data : "+double_data);
        System.out.println("Float Data : "+float_data);
        System.out.println("String Data : "+string_data);
        System.out.println("Char Data : "+char_data);
        System.out.println("Char Data : "+char_data1);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Integer Number ");
        integerdata=scanner.nextInt();
        System.out.println("Input Double Point Value ");
        double_data=scanner.nextDouble();
        System.out.println("Input String Value ");
        scanner.nextLine();
        string_data=scanner.nextLine();

        System.out.println("New Integer value : "+integerdata);
        System.out.println("New Double value : "+double_data);
        System.out.println("New String value : "+string_data);

        //Single Line Comment
        /* Multi Line Comment */

        //Arithmetic Operator
        int num1,num2;
        System.out.println("Input No :  1");
        num1=scanner.nextInt();
        System.out.println("Input No :  2");
        num2=scanner.nextInt();

        int sum=num1+num2;
        int subtract=num1-num2;
        float divide_data=num1/num2;
        int multiple=num1*num2;
        System.out.println("Sum of Num 1 and Num 2 is  : "+sum);
        System.out.println("Subtract of Num 1 and Num 2 is  : "+subtract);
        System.out.println("Divide of Num 1 and Num 2 is  : "+divide_data);
        System.out.println("Multiplication of Num 1 and Num 2 is  : "+multiple);

    }
}
