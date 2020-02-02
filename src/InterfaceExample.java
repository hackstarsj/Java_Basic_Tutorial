public class InterfaceExample {

    public static void main(String args[]){
        //Example of Interface
        System.out.println("Example of Interface :");
        InterfaceExampleProgram interfaceExampleProgram=new InterfaceExampleProgram();
        interfaceExampleProgram.showData1();
        interfaceExampleProgram.showData2();
        interfaceExampleProgram.showData3();
        interfaceExampleProgram.showData4();

        //Example of ENUM
        ConstantData constantData=ConstantData.ANIMAL;
        System.out.println(constantData);

        //Try Catch Example
        String[] array_data={"Data 1","Data 2","Data 3","Data 4","Data 5"};
        try {
            System.out.println("Item : " + array_data[3]);
        }
        catch (Exception e){
           System.out.println("Something Went Wrong");
            // e.printStackTrace();
        }
        finally {
            System.out.println("This Will Execute When All Try Catch Done");
        }


        int num;

        try {
            num = 10 / 0;
        }
        catch (Exception e){
            System.out.println("Something Error Occured");
        }
        finally {
            System.out.println("This Will Execute When All Try Catch Done");
        }


    }
}
