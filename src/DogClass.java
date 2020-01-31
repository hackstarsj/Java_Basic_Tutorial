
public class DogClass extends AnimalAbstractClass {

    String name;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    public String  getName(){
        return this.name;
    }
}
