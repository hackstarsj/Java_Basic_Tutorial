import java.util.Scanner;

public class Example10NSumNumber {
    public static void main(String args[]){
        int num,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Value of N : ");
        num=scanner.nextInt();

        for(int i=0;i<=num;i++){
            sum=sum+i;
        }

        System.out.println("Sum of N no. is "+sum);
    }
}
