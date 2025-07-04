import java.util.Scanner;

public class StartWIthString {
    
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {

        // char arr[] = {'a', 'b', 'c'};

        // method of declaring atrings in java
        // String str1 = "Hello ";
        // String str2 = new String("World");

        // Take input as string
        // Scanner sc = new Scanner(System.in);
        // String fullname = sc.nextLine();
        // System.out.println(fullname.length());

        // Print letters of string 
        printLetters("Anshul Kumar");


        // concatination
        // System.out.println(str1 + str2);

    }
}
