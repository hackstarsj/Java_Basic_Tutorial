public class SimpleCalculatorClass {
    private int a;
    private int b;

    public SimpleCalculatorClass(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int getAddition(){
        return this.a+this.b;
    }

    public int getMultiplication(){
        return this.a*this.b;
    }

    public int getSubtract(){
        return this.a-this.b;
    }

    public void setA(int a){
        this.a=a;
    }

    public void setB(int b){
        this.b=b;
    }


}
