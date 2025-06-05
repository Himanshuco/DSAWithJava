public class Shortestpath {
    public static float shortestpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='S'){
                y--;
            }else if(dir =='N'){
                y++;
            }else if(dir =='W'){
                x--;
            }else{
                x++;
            }   
        }
        int x2 = x*x;
        int y2 = y*y;
        float path = (float)Math.sqrt(x2+y2);
        return path;  
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        float path = shortestpath(str);
        System.out.println("Shortest path : "+path);  
    }
}
