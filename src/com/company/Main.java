package com.company;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        ReflectionChecker checker = new ReflectionChecker();
        Dog dog = new Dog();

        checker.showClassName(dog);

        checker.showClassFields(dog);

        checker.showClassMethods(dog);

        checker.setStringValue(dog, "dogName", "Alex");
        System.out.println("Change dogName: ");
        System.out.println("(new) dogName = " + dog.getDogName());

        checker.setIntValue(dog, "dogAge", 15);
        System.out.println("Change dogAge: ");
        System.out.println("(new) dogAge = " + dog.getDogAge());

        checker.setStringValue(dog, "dogBark", "Meow");
        System.out.println("Change dogBark: ");
        System.out.println("(new) dogBark = " + dog.getDogBark(1));
    }

}





