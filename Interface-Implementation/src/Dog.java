public class Dog implements Animal {


    @Override
    public void eat() {
        System.out.println("Dog  is eating");
    }
    @Override
    public void sleep(){
        System.out.println("Dog is sleep");
    }
    @Override
    public void makesound(){
        System.out.println("Woof Woof");
    }

}
