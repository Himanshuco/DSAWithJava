public class AccessModifier2 {
    public static void main(String[] args) {
        Bankaccount person1 = new Bankaccount();
        person1.unsername = "Himanshu";
        //But here we can't change the password
        person1.password = "Him@123"; //Throw an error

    }

}
class Bankaccount{
    public String unsername;
    private String password; //Password is private that can't be changes by external program.
}
