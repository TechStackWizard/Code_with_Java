
// Printthesum,difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginaryparts are entered by the user.
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // float a1, b1, a2, b2;

        // System.out.println("Enter values for equation(a+bi) -> " +1);
        // System.out.print("Value of a1 -> ");
        // a1 = sc.nextFloat();
        // System.out.print("Value of b1 -> ");
        // b1 = sc.nextFloat();
        
        // System.out.println("Enter values for equation(a+bi) -> " +2);
        // System.out.print("Value of a2 -> ");
        // a2 = sc.nextFloat();
        // System.out.print("Value of b3 -> ");
        // b2 = sc.nextFloat();

        Complex c1 = new Complex(2,0);
        Complex c2 = new Complex(3,6);

        Complex sumRes = Complex.sum(c1, c2);
        Complex subRes = Complex.difference(c1, c2);
        Complex mulRes = Complex.product(c1, c2);
        sumRes.printComplex();
        subRes.printComplex();
        mulRes.printComplex();

    }
}

class Complex {
    int real;
    int imag;

    Complex(int r, int i){
        real = r;
        imag = i;
        
    }

    static Complex sum(Complex c1, Complex c2){
        return new Complex((c1.real + c2.real), (c1.imag + c2.imag));
    }
    static Complex difference(Complex c1, Complex c2){
        return new Complex((c1.real - c2.real), (c1.imag - c2.imag));
    }
    static Complex product(Complex c1, Complex c2){
        return new Complex((c1.real * c2.real), (c1.imag * c2.imag));
    }    
    
    void printComplex(){
        if(real == 0 &&  imag != 0){
            System.out.println(imag + "i");
        }
        else if(real != 0 &&  imag == 0){
            System.out.println(real);
        }
        else{
            System.out.println(real + " + " + imag + "i");
        }
    }

}