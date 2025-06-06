//Inheritance : Inheritance is when properities and methods of base class are passed on to a derived class.
//Keyword : extends
//Types: 
        //1 : Single level inheritance
        //2 : Multilevel inheritance
        //3 : Multiple inheritance (Not supported by java due it ambiguity confusion). (but can be done with interfaces)
        //4 : Hierarchial inheritance
        //5 : Hybrid inheritance

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat(); // Animal function but it is extended by fish so it is also a function of fish.


    }
}
class Animal{
    String color ; 
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Fish extends Animal{
    int fins;

    void swim (){
        System.out.println("Swims in water.");
    }
}
