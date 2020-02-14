import java.sql.*;
import java.util.Scanner;

public class JavaMysqlCrudTutorial {
    public static void main(String args[]){
        String dbUrl="jdbc:mysql://localhost:3306/java_tutorial";
        String db_user="java_user";
        String db_pwd="java_password";

        Connection connection=null;

        try {
            connection = DriverManager.getConnection(dbUrl, db_user, db_pwd);
            if(connection!=null){
                System.out.println("Connected to Database");
            }
        }
        catch (Exception e){
            System.out.println("Failed to Connect Database");
        }

        int menu=0;
        if(connection!=null){
            while (menu!=5){
                menu=ShowMenu();
                if(menu==1){
                    ShowData(connection);
                }
                if(menu==2){
                    InsertData(connection);
                }
                if(menu==3){
                    DeleteData(connection);
                }
                if(menu==4){
                    UpdateData(connection);
                }
                if(menu==5){
                    try {
                        connection.close();
                    }
                    catch (Exception e){
                    }
                    System.out.println("Thanks for Using Program!");
                }
            }
        }
    }

    private static void UpdateData(Connection connection) {
        System.out.println("Update Data");
        ShowData(connection);
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the ID to Update Data ");
            int id=scanner.nextInt();

            String sql="select * from users where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();

            if(resultSet.next()){
                String q_name=resultSet.getString(2);
                String q_password=resultSet.getString(3);
                String q_email=resultSet.getString(4);

                System.out.println("Old Name : "+q_name+ " New Name : ");
                scanner.nextLine();
                String newname=scanner.nextLine();
                System.out.println("Old Password : "+q_password+ " New Password : ");
                String newpassword=scanner.nextLine();
                System.out.println("Old Email : "+q_email+ " New Email : ");
                String newemail=scanner.nextLine();

                String update_sql="UPDATE users SET name=?,password=?,email=? where id=?";
                PreparedStatement preparedStatement1=connection.prepareStatement(update_sql);
                preparedStatement1.setString(1,newname);
                preparedStatement1.setString(2,newpassword);
                preparedStatement1.setString(3,newemail);
                preparedStatement1.setInt(4,id);

                int rowid=preparedStatement1.executeUpdate();
                if(rowid>0){
                    System.out.println("Data Updated");
                }
            }

        }
        catch (Exception e){
            System.out.println("Error in Executing Query");
        }

    }

    private static void DeleteData(Connection connection) {
        System.out.println("Delete Data");
        ShowData(connection);
        try {

            Scanner scanner=new Scanner(System.in);
            int id=scanner.nextInt();
            String sql="DELETE from users where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int rowid=preparedStatement.executeUpdate();
            if(rowid>0){
                System.out.println("Deleted");
            }
        }
        catch (Exception e){
            System.out.println("Error in Executing Query");
        }
    }

    private static void InsertData(Connection connection) {
        System.out.println("Insert Data");
        String sql="INSERT into users (name,password,email) values (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Name : ");
            String name=scanner.nextLine();
            System.out.println("Password : ");
            String password=scanner.nextLine();
            System.out.println("Email : ");
            String email=scanner.nextLine();

            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3,email);

            int rowid=preparedStatement.executeUpdate();
            if(rowid>0){
                System.out.println("Record Inserted");
            }
        }
        catch (Exception e){
            System.out.println("Error in Executing");
        }

    }

    private static void ShowData(Connection connection) {
        System.out.println("Show Data");
        String sql="select * from users";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            int count=0;
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String password=resultSet.getString(3);
                String email=resultSet.getString("email");
                System.out.println("Data : "+" ID : "+id+" Name : "+name+" Email : "+email+" Password : "+password);

            }
        }
        catch (Exception e){
            System.out.println("Error in Executing Query");
        }
    }

    private static int ShowMenu(){
        System.out.println("Java MySql CRUD Operation");
        System.out.println("1.Show Data");
        System.out.println("2.Insert Data");
        System.out.println("3.Delete Data");
        System.out.println("4.Update Data");
        System.out.println("5.Exit");
        System.out.println("Enter Choice : ");
        Scanner scanner=new Scanner(System.in);
        int menu=scanner.nextInt();
        return menu;
    }
}
