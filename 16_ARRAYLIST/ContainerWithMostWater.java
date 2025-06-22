import java.util.*;
public class ContainerWithMostWater {
    public static int bruteStoreWater(ArrayList<Integer>height){ //TC : O(n2)
        int maxwater = 0;
        for(int i = 0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int width = j-i;
                int ht = Math.min(height.get(i), height.get(j));
                int curarea = ht*width;
                maxwater = Math.max(maxwater, curarea);
            }
        }
        return maxwater;
}
    public static int storedWater(ArrayList<Integer> height){ //TC : O(n) Two pointer approach
        int i = 0;
        int j = height.size()-1;
        int area = Integer.MIN_VALUE;
        while(i<j){
            int currWater = 0;
            int ht = Math.min(height.get(i), height.get(j));
            currWater = ht*(j-i);
            area = Math.max(area, currWater);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return area;
}
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //Ans = 7*(8-1) = 49

        int max = storedWater(height);
        System.out.println("Conatiner with Most water : "+max);       
    }
}
