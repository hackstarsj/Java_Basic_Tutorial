import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class JavaSerializationExample {
    public static void main(String args[]){
        StudentClass studentClass=new StudentClass();
        studentClass.setId(1);
        studentClass.setName("Rahul");
        studentClass.setAddress("Delhi");
        studentClass.setCourse("BCA");

        System.out.println("Serialization Example First Writing Data into File");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentClass);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Writed in File");
        }
        catch (Exception e){
            System.out.println("Error in Opening File");
        }

        System.out.println("Reading Serialized Data from File : ");

        try {
            FileInputStream fileInputStream=new FileInputStream("student.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            StudentClass studentClass1=(StudentClass) objectInputStream.readObject();
            System.out.println("Student Data :");
            System.out.println("Name : "+studentClass1.getName());
        }
        catch (Exception e){
            System.out.println("Error in Reading File ");
        }

        System.out.println("Arraylist Serialization Example : ");
        ArrayList<StudentClass> studentList=new ArrayList<>();

        StudentClass studentClass1=new StudentClass();
        studentClass1.setName("Aman");
        studentClass1.setCourse("BCA");
        studentClass1.setAddress("Delhi");
        studentClass1.setId(2);

        StudentClass studentClass2=new StudentClass();
        studentClass2.setName("Vishal");
        studentClass2.setCourse("MCA");
        studentClass2.setAddress("Delhi");
        studentClass2.setId(3);

        StudentClass studentClass3=new StudentClass();
        studentClass3.setName("Rahul");
        studentClass3.setCourse("B.SC");
        studentClass3.setAddress("Delhi");
        studentClass3.setId(4);

        studentList.add(studentClass1);
        studentList.add(studentClass2);
        studentList.add(studentClass3);

        System.out.println("Writing List Data ");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("student_list.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Write Successfully List in File");
        }
        catch (Exception e){
            System.out.println("Error in Opening File");
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("student_list.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

            ArrayList<StudentClass> studentClasses= (ArrayList<StudentClass>) objectInputStream.readObject();
            for(StudentClass studentClass4:studentClasses){
                System.out.println("Name : "+studentClass4.getName());
            }
        }
        catch (Exception e){
            System.out.println("Error in Reading File ");

        }

    }
}
