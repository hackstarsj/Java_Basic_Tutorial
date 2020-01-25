public class JavaNumberMethods {
    public static void main(String args[]){
        int number=144;
        //finding square root
        System.out.println("Square Root of 144 is : "+Math.sqrt(number));

        //nearest rounded up number
        float number2=10.4f;
        System.out.println("Nearest Rounded Up No. is : "+Math.ceil(number2));

        //nearest rounded down number
        System.out.println("Nearest Rounded Down No. is : "+Math.floor(number2));

        //power of number 2^3
        int number3=2;
        int poweroff=3;
        System.out.println("Power of 2^3 is : "+Math.pow(number3,poweroff));

        //rounding no. to nearest
        float num4=15.7f;
        float num5=15.3f;
        System.out.println("Rounded Value of 15.7 is "+Math.round(num4));
        System.out.println("Rounded Value of 15.3 is "+Math.round(num5));

        //Random Number
        System.out.println("Random Number Between 0 to 1 : "+Math.random());


        //Generating Random No. Between Some Range
        int min=1;
        int max=100;
        //Generating Random No. Between 1 to 100;
        int newRandomNo=(int)(Math.random()*max)+min;
        System.out.println("Random No. Between 1 to 100 is "+newRandomNo);

    }
}
