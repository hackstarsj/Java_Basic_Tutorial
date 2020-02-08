public class JavaMultiThreadingExample {
    public static void main(String args[]){
        System.out.println("Multithreading Example : ");

        MultiThreadClassExample multiThreadClassExample=new MultiThreadClassExample();
        multiThreadClassExample.start();

        MultiThreadClassExample multiThreadClassExample2=new MultiThreadClassExample();
        multiThreadClassExample2.start();


    }
}
