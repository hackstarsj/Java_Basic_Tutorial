public class InheritanceExample {
    public static void main(String args[]){
        System.out.println("Example of Inheritance |  Child Class Extends the Parent Class and Use it\'s Property (Method) ");

        AnimalClass animalClass=new AnimalClass();
        animalClass.setName("Spike");
        animalClass.setAtype("Dog");
        animalClass.setSound("Bark");

        CatClass catClass=new CatClass("Cat");
        //Accessing Method of Parent Class
        catClass.setName("Tom");
        catClass.setSound("Meow Meow");

        MouseClass mouseClass=new MouseClass("Jerry");
        //Accessing Method of Parent Class
        mouseClass.setName("Jerry");
        mouseClass.setSound("Squek Squek");

        System.out.println("Animal Name : "+animalClass.getName());
        System.out.println("Animal Name : "+catClass.getName());
        System.out.println("Animal Name : "+mouseClass.getName());

        System.out.println("Example of Polymorphism : ");

        System.out.println("Animal Name : "+catClass.getName());

        System.out.println("Example of Abstraction : ");
        DogClass dogClass=new DogClass();
        dogClass.setName("Spike");
        dogClass.setType("Dog");

        System.out.println("Animal Name : "+dogClass.getName());
        System.out.println("Animal Type : "+dogClass.getType());




    }
}
