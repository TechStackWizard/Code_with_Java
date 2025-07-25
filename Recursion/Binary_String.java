public class Binary_String{
    public static void printNonConsicutive_0(int n, String str, int lp){
        if(n == 0) {
            System.out.println(str);
            return;
        }

        printNonConsicutive_0(n-1, str+'0', 0);
        if(lp == 0){
            printNonConsicutive_0(n-1, str+'1', 1);
        }
    }
    public static void printNonConsicutive_1(int n, String str, int lp){
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lp == 1){
            printNonConsicutive_1(n-1, str+'1', 1);
            printNonConsicutive_1(n-1, str+'0', 0);
        }
        else{
            printNonConsicutive_1(n-1, str+'1', 1);
        }

    }
    public static void main(String[] args) {
        // printNonConsicutive_0(1, "", 0);
        printNonConsicutive_1(2, "", 1);
    }
}