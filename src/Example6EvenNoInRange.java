import java.util.Scanner;

public class Example6EvenNoInRange {
    public static void main(String args[]){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the Value of N : ");
        n=scanner.nextInt();

        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println("Even No: "+i);
            }
        }
    }
}
