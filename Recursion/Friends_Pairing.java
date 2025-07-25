public class Friends_Pairing{

    public static int noOfWays(int n){
        if(n == 1 | n == 2){
            return n;
        }
        int fnm1 = noOfWays(n-1);

        int fnm2 = (n-1) * noOfWays(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(4));
    }
}
