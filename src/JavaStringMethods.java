public class JavaStringMethods {
    public static void main(String args[]){

        //Printing String Value at Positions
        String value="Hello World in Java";
        System.out.println("Printing Value at Position 0 of String : "+value.charAt(0));
        System.out.println("Printing Value at Position 1 of String : "+value.charAt(1));
        System.out.println("Printing Value at Position 10 of String : "+value.charAt(10));

        //Joing Two or More Strings
        String value1="Hello";
        String value2="World";
        String value3="in";
        String value4="java";

        // "+" is used to concatenate String in Java
        String finalSting=value1+" "+value2+" "+value3+" "+value4;
        System.out.println("Final value Joining String is  : "+finalSting);

        //checking String contain String
        String find="java";
        String find2="No";
        boolean checkContains=finalSting.contains(find);
        boolean checkContains2=finalSting.contains(find2);
        System.out.println("Java Contains in FinalString : "+checkContains);
        System.out.println("No Contains in FinalString : "+checkContains2);

        if(finalSting.contains(find)){
            System.out.println("Yes am Inside String Final String");
        }
        else{
            System.out.println("No am not Inside String Final String");
        }

        if(finalSting.contains(find2)){
            System.out.println("Yes am Inside String Final String");
        }
        else{
            System.out.println("No am not Inside String Final String");
        }

        //checking String Equals
        String firstStr="Hello";
        String secondStr="Hello";
        String thirdStr="hello";

        //using equals Method
        boolean isEqual=firstStr.equals(secondStr);
        boolean isEqual2=firstStr.equals(thirdStr);
        System.out.println("Hello Equals to Hello "+isEqual);
        System.out.println("Hello Equals to hello "+isEqual2);

        //using equalsIgnorecase Method
        isEqual=firstStr.equalsIgnoreCase(secondStr);
        isEqual2=firstStr.equalsIgnoreCase(thirdStr);
        System.out.println("Hello Equals to Hello "+isEqual);
        System.out.println("Hello Equals to hello "+isEqual2);

        //Find String Position
        String value5="Hello World in Java World";
        int position=value5.indexOf("World");
        int position2=value5.indexOf("Python");
        int position3=value5.indexOf("W");

        //finding position from last
        int position4=value5.lastIndexOf("W");
        System.out.println("World Position in "+position);

        //if position Not Find it Will Return -1
        System.out.println("Python Position in "+position2);

        System.out.println("W Position in "+position3);
        System.out.println("W Position From End  : "+position4);

        String emptyString="";
        String newString="Hello";
        boolean checkisEmpty=emptyString.isEmpty();
        boolean checkisEmpty2=newString.isEmpty();
        System.out.println("String is Empty : "+checkisEmpty);
        System.out.println("String is Empty : "+checkisEmpty2);


        //finding Length of String
        System.out.println("Length of String is : "+newString.length());


        //Replace String
        String newString2="Hello World WorldWar";
        String replace="Java";
        String newString3=newString2.replace("World",replace);
        System.out.println("New String is "+newString3);

        //String to Array
        String[] array=newString2.split(" ");
        System.out.println("String to Array : "+array[2]);

        //Extract Sub String
        System.out.println("Substring : "+newString2.substring(1));
        System.out.println("Substring : "+newString2.substring(1,10));

        //Remove White Space From String
        String data1="   Hello World    ";
        System.out.println("Data 1 With White Space : "+data1);
        System.out.println("Data 1 Without White Space : "+data1.trim());

        //String to Uppercase

        System.out.println("Data 1 in upppercase : "+data1.toUpperCase());
        //String to Lowercase

        System.out.println("Data 1 in Lowercase : "+data1.toLowerCase());

    }
}
