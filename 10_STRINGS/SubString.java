public class SubString {
     public static String subString(String str , int si , int ei){
        String substring = new String("");
        for(int i = si ; i<ei;i++){
            if(str.charAt(i)==' '){
                continue;
            }
            substring += str.charAt(i); //Concatenation
        }
        return substring; 
    }
    public static void main(String[] args) {
        String str = "Hello world";
        String sub = subString(str, 3, 7);
        System.out.println("The substring is : "+sub);
        
    }
    
}
