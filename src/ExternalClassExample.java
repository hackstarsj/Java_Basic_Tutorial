public class ExternalClassExample {
    int a=10;
    int b=20;
    int c=30;

    public ExternalClassExample(int a,int b){
        this.a=a;
        this.b=b;
    }

    public ExternalClassExample(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getMultiplyValue(){
        return this.a*this.b;
    }

    public int getMultiplyValue2(){
        return this.a*this.b*this.c;
    }

    public int getAddition(int a,int b,int c){
        return a+b+c;
    }

    public int getAddition(int a,int b){
        return a+b;
    }
}
