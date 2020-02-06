import java.io.File;

public class JavaDeleteFileExample {
    public static void main(String args[]){
        System.out.println("Delete File Example : ");
        File file=new File("temp_file.txt");
        if(file.delete()){
            System.out.println("File Deleted");
        }
        else{
            System.out.println("Error in Deleting File");
        }
    }
}
