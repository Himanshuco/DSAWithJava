public class TrappingRainwater {
    public static int trapwater(int height[]) {
        int n = height.length;
        int trapwater = 0;
        if(n==0){
            return 0 ;
        }
        int lheight[] = new int[n];
        int rheight[] = new int[n];

        lheight[0]= height[0];
        rheight[n-1]= height[n-1];

        //Left max Height
        for(int i=1;i<n;i++){
            lheight[i] = Math.max(height[i], lheight[i-1]);
        }

        //Right max Height
        for(int i=n-2;i>=0;i--){
            rheight[i] = Math.max(height[i], rheight[i+1]);
        }

        //Trap water calculation 
        for(int i=0;i<n;i++){
            trapwater+= Math.min(lheight[i], rheight[i])-height[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        int tarp = trapwater(arr);
        System.out.println("Total water trapped : "+tarp);
    }
    
}
