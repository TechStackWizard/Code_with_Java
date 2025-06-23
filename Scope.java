public class Scope {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            System.out.println("Block scope "+i);
        }
        int i=4;
        System.out.println(Math.max(i, i));
    }
}
