public class JavaTypeCastingExample {
    public static void main(String args[]){


        //number casting in different datatypes
        int num1=10;
        //Direct Casting
        double num1d=num1;
        float num1f=num1;
        System.out.println("Integer Value : "+num1);
        System.out.println("Double Value : "+num1d);
        System.out.println("Float Value : "+num1f);


        //other way
        num1d=(double)num1;
        num1f=(float)num1;
        System.out.println("Integer Value : "+num1);
        System.out.println("Double Value : "+num1d);
        System.out.println("Float Value : "+num1f);


        //String to numbers
        String value="102";
        double valued=Double.parseDouble(value);
        float valuef=Float.parseFloat(value);
        int valuei=Integer.parseInt(value);

        System.out.println("String Value : "+value);
        System.out.println("Integer Value : "+valuei);
        System.out.println("Float Value : "+valuef);
        System.out.println("Double Value : "+valued);


        //numbers to string
        int num2=102;
        double num4=100.100;
        float num5=150.19f;
        //Direct Way to String
        String value2=""+num2;
        //Another Way
        String value3=String.valueOf(num2);
        String value4=String.valueOf(num4);
        String value5=String.valueOf(num5);

        System.out.println("String Value "+value2);
        System.out.println("String Value "+value3);
        System.out.println("String Value "+value4);
        System.out.println("String Value "+value5);

    }
}
