public class Palindrome {
    public static boolean ispalindrome(String str) {
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        String str = new String("racaecar");
        boolean check = ispalindrome(str);
        if(check==true){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a paildrome");
        }
    }
}
