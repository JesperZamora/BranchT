public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        System.out.println(dog.eat("dog food"));
        System.out.println(cat.eat("cat food"));
    }


}
