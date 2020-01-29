public class OOPPart1 {

    final int a=10;
    final int b=15;

    public static void main(String args[]){
        System.out.println("This is Example of Class and Objects");

        OOPPart1 oopPart1=new OOPPart1();
        OOPPart1 oopPart2=new OOPPart1();
        FirstInternalClass firstInternalClass=new FirstInternalClass(60,70);
        FirstInternalClass firstInternalClass2=new FirstInternalClass(70,80);
        ExternalClassExample externalClassExample=new ExternalClassExample(50,60);
        ExternalClassExample externalClassExample2=new ExternalClassExample(10,20);
        ExternalClassExample externalClassExample3=new ExternalClassExample(30,40,10);

        //oopPart1.a=20;
        //oopPart1.b=30;

        System.out.println("Value of A : "+oopPart1.a);
        System.out.println("Value of A : "+oopPart1.b);

        System.out.println("Value of A : "+oopPart2.a);
        System.out.println("Value of A : "+oopPart2.b);

        System.out.println("Value of X : "+firstInternalClass.x);
        System.out.println("Value of Y : "+firstInternalClass.y);

        System.out.println("Value of X : "+firstInternalClass2.x);
        System.out.println("Value of Y : "+firstInternalClass2.y);
        System.out.println("Addition of  X and Y is : "+firstInternalClass.getAdditionValue());
        System.out.println("Addition of  X and Y is : "+firstInternalClass2.getAdditionValue());

        System.out.println("Multiplication of  A and B is : "+externalClassExample.getMultiplyValue());
        System.out.println("Multiplication of  A and B is : "+externalClassExample2.getMultiplyValue());
        System.out.println("Multiplication of  A and B is : "+externalClassExample3.getMultiplyValue2());
        System.out.println("Additon of  A and B  is : "+externalClassExample3.getAddition(10,20));
        System.out.println("Additon of  A and B and C is : "+externalClassExample3.getAddition(10,20,30));
        System.out.println("Additon of A and B Without Object : "+ExternalClassWithStaticMethod.getAdditon(10,20));
        System.out.println("Additon of A and B Without Object : "+ExternalClassWithStaticMethod.getAdditon(10,20,40));

        SimpleCalculatorClass simpleCalculatorClass=new SimpleCalculatorClass(10,20);
        simpleCalculatorClass.setA(30);
        simpleCalculatorClass.setB(40);

        System.out.println("Addition : "+simpleCalculatorClass.getAddition());
        System.out.println("Multiplication : "+simpleCalculatorClass.getMultiplication());
        System.out.println("Subtract : "+simpleCalculatorClass.getSubtract());
    }

    public static class FirstInternalClass{
        int x=25;
        int y=30;
        public FirstInternalClass(int x,int y){
            this.x=x;
            this.y=y;
        }

        public int getAdditionValue(){
            return x+y;
        }
    }
}
