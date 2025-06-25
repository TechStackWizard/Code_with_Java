public class TrappingRainfall{
    public static void helpingArray(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftMaxBoun[] = new int[n];
        leftMaxBoun[0] = height[0];
        for(int i=1; i<n; i++){
            leftMaxBoun[i] = Math.max(height[i], leftMaxBoun[i-1]);
        }

        // calculate right max boundary - array
        int rightMaxBoun[] = new int[n];
        rightMaxBoun[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            rightMaxBoun[j] = Math.max(height[j], rightMaxBoun[j+1]);
        }

        // for(int i=0; i<n; i++){
        //     System.out.print(leftMaxBoun[i] + " ");
        // }
        // System.out.println();
        // for(int i=0; i<n; i++){
        //     System.out.print(rightMaxBoun[i] + " ");
        // }

        // loop
        // waterlevel = min(leftMax bound- rightMax bound);
        // trappingWater = waterlevel - height[i];
        int totalVolume = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMaxBoun[i], rightMaxBoun[i]);
            int trappingWater = waterlevel - height[i];
            totalVolume += trappingWater;
        }
        System.out.println("Total volume is : "+totalVolume);

    }

    public static void main(String[] args) {
        int numbers[] = {4,2,0,6,3,2,5};
        helpingArray(numbers);
    }
}