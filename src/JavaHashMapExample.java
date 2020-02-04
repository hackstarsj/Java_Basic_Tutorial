import java.util.ArrayList;
import java.util.HashMap;

public class JavaHashMapExample {
    public static void main(String args[]){
        System.out.println("Hashmap Example : ");

        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("vehicle","Car");
        hashMap.put("vegetables","Potato");

        System.out.println("Value of vegetables : "+hashMap.get("vegetables"));

        hashMap.put("vegetables","Tomato");
        System.out.println("Value of vegetables : "+hashMap.get("vegetables"));

        hashMap.remove("vegetables");

        System.out.println("Hashmap : "+hashMap);

        //printing only all key
        for(String key:hashMap.keySet()){
            System.out.println("Key : "+key);
        }

        //printing only all value
        for(String value:hashMap.values()){
            System.out.println("Value : "+value);
        }

        //printing both key and value
        for(String key:hashMap.keySet()){
            System.out.println("Key: "+key+" : Value : "+hashMap.get(key));
        }

        HashMap<Integer,Integer> integerHashMap =new HashMap<>();

        integerHashMap.put(0,10);
        integerHashMap.put(2,20);
        integerHashMap.put(4,30);

        for(int key:integerHashMap.keySet()){
            System.out.println("Key: "+key+" : Value : "+integerHashMap.get(key));
        }

        HashMap<String, ArrayList<String>> stringArrayListHashMap=new HashMap<>();
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Potato");
        arrayList.add("Tomato");
        arrayList.add("Cabbage");
        stringArrayListHashMap.put("vegetables",arrayList);


        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("Car");
        arrayList2.add("Bike");
        arrayList2.add("Scotty");
        stringArrayListHashMap.put("vehicles",arrayList2);

        System.out.println("Value : "+stringArrayListHashMap);
        System.out.println("Value : "+stringArrayListHashMap.get("vegetables"));

    }

}
