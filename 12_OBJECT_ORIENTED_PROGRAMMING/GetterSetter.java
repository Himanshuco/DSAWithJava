//Getter :
//Setter : 
//this : this keywordis used to refers to the current object.
public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //Object created of a pen called p1. (Created in heap)
        p1.setColor("RED");
        p1.setTip(5);
        // System.out.println("Color of p1 pen : "+p1.color); 
        // System.out.println("Pen tip : "+p1.tip);
        System.out.println("Colour : "+p1.getColor());
        System.out.println("Tip : "+p1.getTip());

    }
    
}
//A class Pen
class Pen{
    //Attributes
    private String color;
    private int tip;

    //Getter
    String getColor(){
        return this.color;

    }

    int getTip(){
        return this.tip;
    }


    //Behaviour (Functions)

    //Setter
    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int tip){
        //tip = newTip;
        //this.tip = newTip //Not mostly used
        this.tip = tip; //Mostly used as both have same name;
    }
}
    
}
