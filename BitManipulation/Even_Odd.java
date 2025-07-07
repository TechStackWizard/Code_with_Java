package BitManipulation;

public class Even_Odd {
    public static void checkEvenOdd(int num){
        if((num & 1) == 1){
            System.out.println(num + " is Odd");
        } else{
            System.out.println(num + " is Even");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(13);
    }
}
