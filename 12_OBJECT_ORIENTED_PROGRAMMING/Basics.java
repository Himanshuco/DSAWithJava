// Object oriented programming is a style of writing.
//Object : Real world entities. 
//Class : Group of these entities. (Blueprint of a object.) (It's has attribute and behaviour).
public class Basics {
     public static void main(String[] args) {
        Pen p1 = new Pen(); //Object created of a pen called p1. (Created in heap)
        p1.setColor("RED");
        p1.setTip(5);
        System.out.println("Color of p1 pen : "+p1.color);
        System.out.println("Pen tip : "+p1.tip);

    }
    
}
//A class Pen
class Pen{
    //Attributes
    String color;
    int tip;

    //Behaviour (Functions)
    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

