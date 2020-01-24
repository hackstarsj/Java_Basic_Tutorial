public class ForLoopExample {


    public static void main(String args[]){
        String[] number_data={"1","2","3","4","5"};
        for(int i=0;i<5;i=i+2){
            System.out.println("Value of i is : "+i);
        }


        System.out.println("For Each Loop");
        for(String data:number_data){
            System.out.println("Item : "+data);
        }

        System.out.println("Break Statement");
        for(int i=0;i<5;i++){
            if(i==4){
                //Break Statement Will End The Loop
                System.out.println("Loop End at i=4");
                break;
            }
            System.out.println("Value of i is : "+i);
        }

        System.out.println("Continue Statement");
        for(int i=0;i<5;i++){
            if(i==3){
                //Continue Statement Will Skip The Loop
                System.out.println("This Will Skip 3");
                continue;
            }
            System.out.println("Value of i is : "+i);
        }

        //Nested loop
        for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
                System.out.println("value of I is : "+i+" K is : "+k);
            }
            System.out.println("Internal Loop End");
        }

        //Print Table of 2 Using For Loop
        for (int table=1;table<=10;table++){
            System.out.println(" 2 x "+table+" = "+table*2);
        }
    }
}
