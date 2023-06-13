package _11._02._02;

abstract class Animal{
    abstract void cry();
}
class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class _02 {
    public static void main(String[] args) {
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();

        ani1.cry();
        ani2.cry();
    }
}
