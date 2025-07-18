public class TypeOfInheritence {

    public static void main(String[] args) {

        // Employee e1 = new Employee("Anshul", 123, 2000);
        // e1.showDetails();
        // Employee e2 = new Employee("Rohan", 234, 5000);
        // e2.showDetails();

        // Manager m1 = new Manager();
        // m1.name = "Tyresin Lanninster";
        // System.out.println(m1.name);

        // Human h1 = new Human();
        // h1.breath();
        // h1.walk();

        // h1.eat();

        // h1.skin = "Brown";

        // System.out.println(h1.skin);

        // Dog sefered = new Dog();
        // // Dog sefered = new Dog();
        // sefered.sound();
        
        // Abstraction
        // Shape circle = new Circle(5);
        // circle.calculateArea();
        // Shape rec = new Rectangle(10, 20);
        // rec.calculateArea();
    }
}

// 1. Single Inheritence
// class Employee{
// String name;
// int id;
// private int salary;
// // Employee(String name, int id, int salary){
// // this.name = name;
// // this.id = id;
// // this.salary = salary;
// // }
// // void setSalary(int salary){
// // this.salary = salary;
// // }

// void work(){
// System.out.println("Working...");
// }

// void showDetails(){
// System.out.println(this.name);
// System.out.println(this.id);
// System.out.println(this.salary);
// }
// }

// class Manager extends Employee{
// Manager(String name, int id, int salary) {
// super(name, id, salary);
// //TODO Auto-generated constructor stub
// }
// void manageTeam(){
// System.out.println("Manage team T1.");
// }
// }

// 2. Multilevel Inheritancederived
// In this inheritance the two or more child or classes extends values from it's
// upper class
// Eaxmple : Animals -> Mamels -> Humans

// class Animals{
// String skin;

// void breath(){
// System.out.println("Breathing....");
// }

// void eat(){
// System.out.println("Eating...");
// }
// }

// class Mamel extends Animals{
// void walk(){
// System.out.println("Walk...");
// }
// }

// class Human extends Mamel{
// int leg;
// void talk(){
// System.out.println("Talking...");
// }

// void think(){
// System.out.println("Thinking");
// }
// }

// 3. Herarchical Inheritence
// class Mamel{
// int skin;
// void breath(){
// System.out.println("Breathing....");
// }
// void eat(){
// System.out.println("Eating...");
// }
// }
// class Dog extends Mamel{
// String breed;
// void bark(){
// System.out.println("Barking....");
// }
// }
// class Human extends Mamel{
// void Talk(){
// System.out.println("Talkig...")
// }
// }
// class Cat extends Mamel{
// void miow(){
// System.out.println("Miowing....");
// }
// }

// 4. Hybrid Inheritence
// class Animal{
// String skin;
// void breath(){
// System.out.println("Breathing....");
// }
// void eat(){
// System.out.println("Eating...");
// }
// }
// class Fish extends Animal{
// int fins;
// void swim(){
// System.out.println("Swimming...");
// }
// }
// class Tuna extends Fish{
// String body = "Sleek";
// void swim(){
// System.out.println("Fast Swimming...");
// }
// }
// class Shark extends Fish{
// String teeth = "Sharp";
// }
// class Mamel extends Animal{
// String blood = "Warm-Blooded";
// }
// class Dog extends Mamel{
// String breed;
// void bark(){
// System.out.println("Barking....");
// }
// }
// class Human extends Mamel{
// void Talk(){
// System.out.println("Talkig...");
// }
// }
// class Cat extends Mamel{
// void miow(){
// System.out.println("Miowing....");
// }
// }

// Polymorphism : It allows you to use single interface, it also allows to take objects in many form s.

// Method overLoading
// class MathOperations{

//     void sum(int a, int b){

//     }
//     void sum(double a, double b){

//     }
// }

// Method overRiding
// class Animal{
//     void eat(){
//         System.out.println("Eating...");
//     }

//     void sound(){
//         System.out.println("Sound is Different of each animals...");
//     }

// }

// class Dog extends Animal{
//     void eat(){
//         System.out.println("Eat Using Toung");
//     }
//     void sound(){
//         System.out.println("Barking...");
//     }
// }

// class Cat extends Animal{
//     void sound(){
//         System.out.println("Meowe...");
//     }
// }


// Abstraction : It similar to enummeration insted of it hides ony unnessesary data and provides important data too.
// It can be defined classes or functions using abstract keyword but not be implements into same class. Basically these ase gives an idea not implementation.
// Abstract method do not specify the body... and you cannot create the object of abstract class;

// Eaxmple 1
// abstract class Animal{
//     void eat(){
//         System.out.println("Eating...");
//     }

//     abstract void sound();
// }

// class Dog extends Animal{
//     void sound(){
//         System.out.println("Barking...");
//     }
// }
// class Cat extends Animal{
//     void sound(){
//         System.out.println("Meowe...");
//     }
// }


// Example 2
// Shape	Circle, Rectangle	calculateArea()

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
      
    void calculateArea() {
        System.out.println("Area of circle is : "+ Math.PI * radius);        
    }
}

class Rectangle extends Shape{
    int length ;
    int breath;

    Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }
    
    void calculateArea(){
        System.out.println("Area of rectangle is : "+ length *breath);
    }
}

//When we create an object using the Cat class, the constructor chain first calls the parent class constructor, and then the subclass (Cat) constructor;

abstract class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor called");
    }
}

class Cat extends Dog{
    Cat(){
        System.out.println("Cat constructor called");
    }
}


// Interfaces :- Interfaces are the blueprint of classes
interface InnerTypeOfInheritence {


    
}









