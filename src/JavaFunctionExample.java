public class JavaFunctionExample {
    public static void main(String args[]){
        //Inbuilt Function
        System.out.println("I am In Built Function");

        //calling the Simple Function
        SimpleFunction();

        //calling simple parameter Function
        SimpleFunctionWithParameter("Passing Data in Parameter Function ! Printing this Data");

        int sum=AddNumber(10,20);
        System.out.println("Sum of Number : "+sum);

        System.out.println(getNumber());

        System.out.println("Factorial of 6 is Using Recursive Function : "+getFactorial(6));
    }

    //Simple Function
    private static void SimpleFunction(){
        System.out.println("I am Simple Function");
    }

    private static void SimpleFunctionWithParameter(String data){
        System.out.println(data);
    }

    private static int AddNumber(int a,int b){
        int sum=a+b;
        return sum;
    }

    private static int getNumber(){
        return 10;
    }

    private static int getFactorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*getFactorial(n-1);
        }
    }
}
