public class StringComparision {
    public static void main(String[] args) {
    String fruits[] = {"apple", "mango", "banana"};
    String largest = fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest = fruits[i];
        }
    }
    System.out.println("Largest String is : "+largest);
   }
}

//Notes:
//     str.compareTo(str2)
//     0 : both string equal
//     < 0 : str < str2
//     > 0 : str > str2