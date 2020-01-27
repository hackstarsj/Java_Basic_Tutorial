import java.util.Scanner;

public class Example5OldNoInRange {
    public static void main(String args[]){
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input the Value of N : ");
        n=scanner.nextInt();

        for (int i=1;i<n;i++){
            if(i%2!=0){
                System.out.println("Odd no : "+i);
            }
        }
    }
}
