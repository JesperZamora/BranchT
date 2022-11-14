public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Woof");
    }

    public boolean eat(String FoodType){
        return true;
    }

    public void mood(boolean mood) {
        if(!mood) {
            System.out.println("knurrer");
        } else {
            System.out.println("logrer");
        }
    }
}
