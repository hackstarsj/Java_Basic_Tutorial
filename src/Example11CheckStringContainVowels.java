import java.util.Scanner;

public class Example11CheckStringContainVowels {
    public static void main(String args[]){
        String string;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input String : ");
        string=scanner.nextLine();

        if(string.contains("A") || string.contains("E") || string.contains("I") || string.contains("O") || string.contains("U") || string.contains("a") || string.contains("e") || string.contains("i") || string.contains("o") || string.contains("u"))
        {
            System.out.println("Yes String Contain Vowels");
        }
        else{
            System.out.println("No String Not Contain Vowels");
        }

    }
}
