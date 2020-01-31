public class CatClass extends AnimalClass {

    String name;

    //method Overriding
    public void setName(String name){
        this.name=name;
    }

    public CatClass(String type){
        setAtype(type);
    }

    //method Overriding
    public String getName(){
        return "My Name is  : "+this.name;
    }
}
