public class Tailing_Program {

    public static int tailingWays(int n) {
        if (n == 0 || n == 1)
            return 1;

        // work
        // Viertical tiles
        int fnm1 = tailingWays(n - 1);

        // Horizontal tiles
        int fnm2 = tailingWays(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tailingWays(5));
    }
}
