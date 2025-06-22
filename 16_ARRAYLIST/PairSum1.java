import java.util.*;
//2 pointer approach 
public class  PairSum1 {
    public static ArrayList pairSum(ArrayList<Integer> list , ArrayList<Integer> ans , int target  ){
        int lp = 0;
        int hp = list.size()-1;
        while(lp<hp){
            if(list.get(lp)+list.get(hp)==target){
                ans.add(lp);
                ans.add(hp);
                ans.add(-1);
            }
            if(list.get(lp)+list.get(hp)>target){
                hp--;
            }else{
                lp++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);   
        
        int target = 5;
        
        ArrayList <Integer> ans = new ArrayList<>();
        pairSum(list , ans , target);
        System.out.println("Index : ");
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==-1){
                System.out.println();
                continue;
            }
            System.out.print(ans.get(i)+" ");
            
        } 
    }

}