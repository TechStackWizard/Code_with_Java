import javax.swing.plaf.synth.SynthStyle;

public class BasicsBit {

    public static void BasicsBit() {
        // AND &; OR |; XOR ^(1 input is true then only output is 1); NOT~(1's comp)
        System.out.println(8 & 2);
        System.out.println(7 | 6);
        System.out.println(5 ^ 1);
        System.out.println(~4); //concept of 2's complement (1's comp + 1 = 2's comp)
        System.out.println(4 << 2); // a<<b = a*2^b
        System.out.println(6>>2);  //a>>b = a/2^b
    }

    public static void main(String[] args) {
        
        BasicsBit();
    }
}
