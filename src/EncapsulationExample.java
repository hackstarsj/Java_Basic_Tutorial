public class EncapsulationExample {
    public static void main(String args[]){
        System.out.println("Example of Encapsulation | Hiding of Data Member from User. Update and get Value Using Set and Get Methods");
        AnimalClass catobj=new AnimalClass();
        catobj.setName("Tom");
        catobj.setAtype("Cat");
        catobj.setSound("Meow Meow");

        AnimalClass mouseobj=new AnimalClass();
        mouseobj.setName("Jerry");
        mouseobj.setAtype("Mouse");
        mouseobj.setSound("Squek Squek");


        System.out.println("Animal Name : "+catobj.getName());

        System.out.println("Animal Name : "+mouseobj.getName());


    }
}
