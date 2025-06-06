//COPY  CONSTRUCTOR : (By default in C++). It copy the property of one object in another obejct completely.

public class CopyConstructor {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student s1 = new Student();
        s1.name = "Kapil";
        s1.rollno = 10056;
        s1.password = "Ky29";
        //Suppose Kapil forgets his password. So here we want to create a new objcet of kapil nwith same values but diffrent password.
        Student s2 = new Student(s1);
        s2.password = "Ky11"; //New password set with other properties same.
        System.out.println("Name : "+s2.name);
        System.out.println("Roll no : "+s2.rollno);
        System.out.println("Password : "+s2.password);
    }
}
class Student{
    String name;
    int rollno;
    String password;

    Student(Student s1) {
        System.out.println("Copy constructor");
        this.name =  s1.name;
        this.rollno  = s1.rollno;

    }
    //Constructor (Default)
    Student(){
        System.out.println("Student consturctor is called...");

    }   
}

//Deep copy : New object are created. (Changes are not reflected)
//Shallow copy : Here we only copy the reference.Not create new objects. (Changes are reflected)
