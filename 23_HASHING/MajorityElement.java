import java.util.*;

public class MajorityElement {
    public static void majorityElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        Set <Integer> keySet = map.keySet();
        System.out.print("Majority element = ");

        for(Integer v : keySet){
            if(map.get(v)>n/3){
                System.out.print(v+" ");;
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int arr2[] = {1,2};
        majorityElement(arr);
        majorityElement(arr2);
    }
    
}
