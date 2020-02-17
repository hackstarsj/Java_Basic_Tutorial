import com.mongodb.*;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaMongoDBCrudTutorial {
    public static void main(String args[]){
        System.out.println("===========MongoDB CRUD Tutorial=============");

        MongoCredential mongoCredential=MongoCredential.createCredential("java_user","admin","java_pwd".toCharArray());
        List<MongoCredential> mongoCredentials=new ArrayList<>();
        mongoCredentials.add(mongoCredential);

        ServerAddress serverAddress=new ServerAddress("localhost",27017);
        MongoClient mongoClient=new MongoClient(serverAddress,mongoCredentials);

        DB db=mongoClient.getDB("java_database");
        int menu=0;
        while (menu!=5){
            menu=ShowMenu();
            if(menu==1){
                ShowData(db);
            }
            if(menu==2){
                InsertData(db);
            }
            if(menu==3){
                DeleteData(db);
            }
            if(menu==4){
                UpdateData(db);
            }
            if(menu==5){
                System.out.println("Thanks for Using Program!");
            }
        }
    }

    private static void UpdateData(DB db) {
        System.out.println("Update Data");
        System.out.println("Enter ID to Update Data : ");
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();
        DBObject query=BasicDBObjectBuilder.start().add("_id",new ObjectId(id)).get();

        System.out.println("Name : "+query);

        System.out.println("Enter Name : ");
        String name=scanner.nextLine();
        System.out.println("Enter Email : ");
        String email=scanner.nextLine();
        System.out.println("Enter Address Line 1 : ");
        String address1=scanner.nextLine();
        System.out.println("Enter Address Line 2 : ");
        String address2=scanner.nextLine();
        List<String> skills=new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("Enter Skill "+i+": ");
            String skill=scanner.nextLine();
            skills.add(skill);
        }

        BasicDBObjectBuilder basicDBObjectBuilder=BasicDBObjectBuilder.start();
        basicDBObjectBuilder.append("name",name);
        basicDBObjectBuilder.append("email",email);

        //Address Object
        BasicDBObject addressObj=new BasicDBObject();
        addressObj.append("line1",address1);
        addressObj.append("line2",address2);

        //adding address object into main object
        basicDBObjectBuilder.append("address",addressObj);

        basicDBObjectBuilder.append("skill",skills);

        DBCollection dbCollection=db.getCollection("user_data");

        DBObject dbObject=basicDBObjectBuilder.get();

        WriteResult writeResult=dbCollection.update(query,dbObject);
        System.out.println("Data Updated");
        System.out.println(writeResult.getN());

    }

    private static void DeleteData(DB db) {
        System.out.println("Delete Data");
        System.out.println("Enter ID : ");
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();
        DBObject dbObject=BasicDBObjectBuilder.start().add("_id",new ObjectId(id)).get();
        DBCollection dbCollection=db.getCollection("user_data");
        dbCollection.remove(dbObject);
    }

    private static void InsertData(DB db) {
        System.out.println("Insert Data");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name=scanner.nextLine();
        System.out.println("Enter Email : ");
        String email=scanner.nextLine();
        System.out.println("Enter Address Line 1 : ");
        String address1=scanner.nextLine();
        System.out.println("Enter Address Line 2 : ");
        String address2=scanner.nextLine();
        List<String> skills=new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("Enter Skill "+i+": ");
            String skill=scanner.nextLine();
            skills.add(skill);
        }

        BasicDBObjectBuilder basicDBObjectBuilder=BasicDBObjectBuilder.start();
        basicDBObjectBuilder.append("name",name);
        basicDBObjectBuilder.append("email",email);

        //Address Object
        BasicDBObject addressObj=new BasicDBObject();
        addressObj.append("line1",address1);
        addressObj.append("line2",address2);

        //adding address object into main object
        basicDBObjectBuilder.append("address",addressObj);

        basicDBObjectBuilder.append("skill",skills);

        DBCollection dbCollection=db.getCollection("user_data");

        DBObject dbObject=basicDBObjectBuilder.get();

        WriteResult writeResult=dbCollection.insert(dbObject);
        ObjectId id= (ObjectId) dbObject.get("_id");
        System.out.println("Insert ID : "+id);
        System.out.println(writeResult.getN());
    }

    private static void ShowData(DB db) {
        DBCollection dbCollection=db.getCollection("user_data");
        DBObject query=BasicDBObjectBuilder.start().get();
        DBCursor dbcursor=dbCollection.find(query);
        while(dbcursor.hasNext()){
            DBObject dbObject=dbcursor.next();
            System.out.println("====================Full Data ============================");
            System.out.println(dbObject);
            System.out.println("Name : "+dbObject.get("name"));
            System.out.println("Address Object: "+dbObject.get("address"));
            DBObject addressobj= (DBObject) dbObject.get("address");
            System.out.println("Address Plain: "+addressobj.get("line1")+" , "+addressobj.get("line2"));
            List<String> skill= (List<String>) dbObject.get("skill");
            System.out.println("Skill Object: "+dbObject.get("skill"));
            System.out.println("Skill Plain: "+skill.get(0)+" , "+skill.get(1)+" , "+skill.get(2));
            System.out.println("==========================================================");
        }
    }

    private static int ShowMenu() {
        System.out.println("Java MongoDB CRUD Operation");
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
