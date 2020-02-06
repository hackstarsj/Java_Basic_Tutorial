import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaFileCreateWriteExample {
    public static void main(String args[]){
        System.out.println("File Handling Write Example : ");
        File file=new File("temp_file.txt");

        Scanner scanner=new Scanner(System.in);

        //checking file already exist
        if(file.exists()){
            System.out.println("File Already Exist!");

            System.out.println("Enter Data to Write in File ");
            String text_data=scanner.nextLine();
            try {
                //For Appending Data to file pass true
                FileWriter fileWriter = new FileWriter("temp_file.txt",true);
                //for Adding New Line Added \n
                fileWriter.write("\n"+text_data);
                fileWriter.close();
            }
            catch (Exception e){
                System.out.println("Error in Opening File");
            }

        }
        else{
            //creating new file
            try {
                file.createNewFile();
                System.out.println("New File Created");
                System.out.println("Enter Data to Write in File ");
                String text_data=scanner.nextLine();
                try {
                    FileWriter fileWriter = new FileWriter("temp_file.txt");
                    fileWriter.write(text_data);
                    fileWriter.close();
                }
                catch (Exception e){
                    System.out.println("Error in Opening File");
                }

            }
            catch (Exception e){
                System.out.println("Something Went Wrong on Creating New File");
            }
        }

    }
}
