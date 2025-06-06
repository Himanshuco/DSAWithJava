// Encapuslation : The wrapping of data and methods in a single unit(usually class) is called Encapsulation. 
                // It also implement data hinding.(access modifier)
public class Encapsulation {
    public static void main(String[] args) {
        //DOG OBJECT
        Animal dog = new Animal();
        dog.name= "Husky";
        dog.sound  ="Bark";
        System.out.println("DOG NAME :"+dog.name);
        System.out.println("DOG SOUND :"+dog.sound);

        //CAT OBJECT
        Animal cat = new Animal();
        cat.name= "Catty";
        dog.sound  ="Mewo";
        System.out.println("DOG NAME :"+cat.name);
        System.out.println("DOG SOUND :"+cat.sound);

    }
    
}
//Encapsulation of Animal 
class Animal{
    //Data
    String name;
    String sound;

    //Methods
    void setName(String name){
        this.name = name;
    }

    void setSound(String sound){
        this.sound = sound;
    }
}
