package week7.animal;

public class Test {
    public static void main(String[] args) {
        //Normal casting of object type
        Cat cat1 = new Cat("Flex");
        cat1.greets();
        Dog dog1 = new Dog("Flex");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Flex");
        bigDog1.greets();

        //Upcast to parent class to achieve polymorphism: A class can be in many shapes and forms: Cat/Dog/BigDog
        Animal animal1 = new Cat("Flex");
        animal1.greets();
        Animal animal2 = new Dog("Flex");
        animal2.greets();
        Animal animal3 = new BigDog("Flex");
        animal3.greets();
        System.out.println("------");
        //Cannot instantiate abstract class
        //        Animal animal4 = new Animal("Flex");

        //Downcast parent class to child class
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        //Cannot downcast different type of child classes: A dog cannot be downcast to a cat type
//        Cat cat2 = (Cat) animal2;

        //Dog implementation of greets
        dog2.greets(dog3);
        //BigDog implementation of greets since dog3 true nature is a BigDog
        dog3.greets(dog2);
        //Dog implementation of greets(Dog another) since BigDog is still a Dog
        dog2.greets(bigDog2);
        //BigDog implementation of greets(Dog another)
        bigDog2.greets(dog2);
        //BigDog implementation of greets(BigDog another)
        bigDog2.greets(bigDog1);

    }
}
