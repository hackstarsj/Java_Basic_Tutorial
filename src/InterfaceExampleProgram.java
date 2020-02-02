public class InterfaceExampleProgram implements FirstDemoInterface,SecondDemoInterface {

    @Override
    public void showData1() {
        System.out.println("This is Function 1");
    }

    @Override
    public void showData2() {
        System.out.println("This is Function 2");
    }

    @Override
    public void showData3() {
        System.out.println("This is Function 3");
    }

    @Override
    public void showData4() {
        System.out.println("This is Function 4");
    }
}
