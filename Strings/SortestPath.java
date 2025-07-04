public class SortestPath {
    public static float printDisplacement(String str){
        // We Assume North(↑) South(↓) West(←) East(→)
        int x=0, y=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'N') y++; //for north
            else if(str.charAt(i) == 'S') y--; //for south
            else if(str.charAt(i) == 'E') x++; //for east
            else x--; //for west
        }

        return (float)Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        float res = printDisplacement(str);
        System.out.println("Sortest Displacement is : "+res);
        
    }
}
