public class FriendsPair {
    public static int FriendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        return FriendPair(n-1)+(n-1)*FriendPair(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        int total = FriendPair(n);
        System.out.println("Total ways to arrange(single or in pair) the firends = "+total);

    }
    
}
