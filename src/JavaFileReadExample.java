import java.io.File;
import java.util.Scanner;

public class JavaFileReadExample {
    public static void main(String args[]){
        System.out.println("Read File Example : ");

        File file=new File("temp_file.txt");
        Scanner scannerread=new Scanner(System.in);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data=scanner.nextLine();
                System.out.println(data);
            }

            System.out.println("File Information : ");
            System.out.println("Name : "+file.getName());
            System.out.println("Path : "+file.getAbsolutePath());
            System.out.println("Parent : "+file.getParent());
            System.out.println("Writeable : "+file.canWrite());
            System.out.println("Readable : "+file.canRead());
            System.out.println("Executeable : "+file.canExecute());
            System.out.println("Size : "+file.length());
            System.out.println(file);
        }
        catch (Exception e){
            System.out.println("Something Wrong on Reading File");
        }

        System.out.println("Do You Want to Delete File ? Yes / No");
        String input=scannerread.nextLine();

        if(input.equalsIgnoreCase("yes")){
            if(file.delete()){
                System.out.println("File Deleted");
            }
            else{
                System.out.println("Error in Deleting File");
            }

        }
        else{
            System.out.println("File Not Deleted");
        }


    }
}
