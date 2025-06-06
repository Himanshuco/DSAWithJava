//Constructor : It is a method which is invoked automatically at the time of object creation. //It intializes the initial values.
//Properties :
                //1 Constructor have same name as class or Structure(in C++).
                //2 Constructor can be called once ,  at the object creation.
                //3 Memory allocation happens when constructor is called.
                //4 Constructor don't have a return type(not void also.).
//Types :
                //1 Default constructor
                //2 Non Paramterized constructor
                //3 Paramterized constructor
                //4 Copy constructor
public class ConstructorInOOP{
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student s1 = new Student("Himanshu");
        System.out.println("Student name: "+s1.name);
        System.out.println();
        Student s2 = new Student(10651);
        System.out.println("Student rollno  "+s1.rollno);
        System.out.println();
        Student s3 = new Student("Himanshu",10651);
        System.out.println("Student name: "+s3.name+" Student rollno : "+s3.rollno);


    }
}
class Student{
    String name;
    int rollno;
    //Constructor (Default)
    // Student(){

    // }
     
    //Constructor (Non Parameterized)
    // Student(){
    //     System.out.println("Constructor is called.");
    // }

    //Constructor (Parameterized)
    Student(String name){
        System.out.println("Name Constructor is called.");
        this.name = name;
    }
    Student(int rollno){
        System.out.println("Roll no Constructor is called.");
        this.rollno = rollno;
    }
    Student(String name,int rollno){
        System.out.println("Name and Roll no Constructor is called.");
        this.name = name;
        this.rollno = rollno;

    }
}
//Constructor overloading : Eg : Student(int rollno) , Student(String name) 
//Constructor overloading is a polymorphism.