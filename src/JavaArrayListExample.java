import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayListExample {
    public static void main(String args[]){
        System.out.println("Arraylist Example");

        //Declaring Arraylist
        ArrayList<String> arrayList=new ArrayList<>();

        //Adding Item
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Banana");

        //accessing item
        System.out.println("Accessing Item at 1 : "+arrayList.get(1));
        System.out.println("Accessing Item at 0 : "+arrayList.get(0));

        //changing item
        arrayList.set(0,"Coconut");
        System.out.println("After Update");
        System.out.println("Accessing Item at 0 : "+arrayList.get(0));

        //Printing all Item Using For Loop .size() for size of arraylist
        for(int i=0;i<arrayList.size();i++){
            System.out.println("Index : "+i+" value : "+arrayList.get(i));
        }

        //Printing all Item Using For Each Loop .size() for size of arraylist
        for(String data:arrayList){
            System.out.println("value : "+data);
        }

        //removing single item
        arrayList.remove(1);

        for(String data:arrayList){
            System.out.println("value : "+data);
        }

        //removing all item
        arrayList.clear();
        System.out.println("After Removing All item");
        for(String data:arrayList){
            System.out.println("value : "+data);
        }

        System.out.println("Size of Arraylist : "+arrayList.size());

        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Banana");

        System.out.println("Size of Arraylist : "+arrayList.size());

        //sorting arraylist
        Collections.sort(arrayList);
        for(String data:arrayList){
            System.out.println("value : "+data);
        }

        //2d Arraylist
        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Car");
        arrayList1.add("Bike");
        arrayList1.add("Scotty");
        arrayLists.add(arrayList1);


        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("Potato");
        arrayList2.add("Tomato");
        arrayList2.add("Cabbage");

        arrayLists.add(arrayList2);

        System.out.println("Size of Arraylist "+arrayLists.size());
        for(int i=0;i<arrayLists.size();i++){
            System.out.println("Loop "+i);
            for(int j=0;j<arrayLists.get(i).size();j++){
                System.out.println("Item : "+arrayLists.get(i).get(j));
            }
        }

        System.out.println(arrayLists);

        //changing type
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(10);
        integers.add(34);

        System.out.println("Integer Arraylist : "+integers);


    }
}
