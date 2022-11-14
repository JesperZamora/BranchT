public class Cat extends Animal{

    public void makeSound(){
        System.out.println("Meow");
    }

    public boolean eat(String FoodType){
        return true;
    }

    public boolean mood() {
        return false;
    }

    public void mood(boolean mood) {
        if(!mood) {
            System.out.println("hvæser");
        } else {
            System.out.println("spinder");
        }
    }
}
