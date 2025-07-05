import java.util.*;
public class MakeUppercase {

    public static String toUpperCase(String msg){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(msg.charAt(0));
        sb.append(ch);

        for(int i=1; i<msg.length(); i++){
            if(msg.charAt(i) == ' ' && i < msg.length()-1){
                sb.append(msg.charAt(i));
                i++;
                sb.append(Character.toUpperCase(msg.charAt(i)));
            }
            else{
                sb.append(msg.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String msg = "hi, i am anshul";
        System.out.println(toUpperCase(msg));
    }
}
