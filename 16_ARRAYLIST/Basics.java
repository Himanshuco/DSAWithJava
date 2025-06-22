import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Array List");
        //Operations
        //1)Add
        al.add(1); //T.C :- O(1)
        al.add(2);
        al.add(3);
        al.add(3,5); //T.C :- O(n)

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        //Size
        System.out.println("SIZE OF ARRAYLIST IS : "+al.size());

        

        //2)Get element
        al.get(2); //T.C :- O(1)
        al.get(3);

        //3)Remove element
        al.remove(1); //T.C :- O(1)
        System.out.println("SIZE OF ARRAYLIST IS : "+al.size());

        //4)Set element 
        al.set(2,4); //T.C :- O(n)

        //5)Contains
        boolean ans =  al.contains(4); //T.C :- O(n)    
        System.out.println(ans);

        //Multi-Dimensional 
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);
        ArrayList <Integer> list2 = new ArrayList<>();
        list.add(3);
        list.add(4);
        mainlist.add(list2);

        System.out.println("Elements : ");
        for(int i=0;i<mainlist.size();i++){
            System.out.print(mainlist.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            // System.out.println();
        }
    }
}