import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String args[]){
        int i=5;
        while(i!=0){
            System.out.println("Value of i : "+i);
            i--;
        }

        System.out.println("While Loop Example");
        i=0;
        while(i<0){
            System.out.println("Value of i : "+i);
            i++;
        }


        //Do Loop Example
        System.out.println("Do While Loop Example");
        i=0;
        do{
            System.out.println("Value of i : "+i);
            i++;
        }
        while(i<0);

        Scanner scanner=new Scanner(System.in);
        String input="";
        while (!input.equalsIgnoreCase("5")){
            System.out.println("Enter Choice : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter Choice : ");
            scanner.nextLine();
            input=scanner.nextLine();


            if(input.equalsIgnoreCase("1")){
                System.out.println("Input Num 1");
                int num1=scanner.nextInt();
                System.out.println("Input Num 2");
                int num2=scanner.nextInt();

                int sum=num1+num2;
              System.out.println("Sum of Num 1 & Num 2 is : "+sum);
            }
            else if(input.equalsIgnoreCase("2")){
                System.out.println("Input Num 1");
                int num1=scanner.nextInt();
                System.out.println("Input Num 2");
                int num2=scanner.nextInt();

                int sub=num1-num2;
                System.out.println("Subtract of Num 1 & Num 2 is : "+sub);
            }
            else if(input.equalsIgnoreCase("3")){
                System.out.println("Input Num 1");
                int num1=scanner.nextInt();
                System.out.println("Input Num 2");
                int num2=scanner.nextInt();

                int mul=num1*num2;
                System.out.println("Multiplication of Num 1 & Num 2 is : "+mul);
            }
            else if(input.equalsIgnoreCase("4")){
                System.out.println("Input Num 1");
                int num1=scanner.nextInt();
                System.out.println("Input Num 2");
                int num2=scanner.nextInt();

                int div=num1/num2;
                System.out.println("Divide of Num 1 & Num 2 is : "+div);
            }
            else if(input.equalsIgnoreCase("5")){
                System.out.println("Thanks for using This Program");
            }
            else{
                System.out.println("Invalid Choice Try Again");
            }

        }

    }
}
