public class TowerofHanoi {
    public static void towerofHanoi(int n , String src , String aux , String dest){
        if(n==1){
            System.out.println("Transfered disk "+" form "+src+" to "+ dest);
            return;
        }
        towerofHanoi(n-1,src , dest, aux);
        towerofHanoi(1,src , aux , dest);
        towerofHanoi(n-1,aux , src , dest);

    }
    public static void main(String[] args) {
        int numofDisk = 2;
        towerofHanoi(numofDisk , "A" , "B" , "C");
        
    }
    
}
