package OOPs;

import java.util.Scanner;

class Complex{
    int real, img;

    // Constructor
    Complex(int r, int i){
        real = r;
        img = i;
    }

    // Methods
    Complex add(Complex c){
        return new Complex(this.real + c.real, this.img + c.img);
    }
    Complex substract(Complex c){
        return new Complex(this.real - c.real, this.img - c.img);
    }
    Complex product(Complex c){
        int r = this.real * c.real - this.img * c.img;
        int i = this.real * c.img + this.img * c.real;
        return new Complex(r, i);
    }
    void print(){
        if (img >= 0){
            System.out.println(real +" + "+ img +"i");
        }
        else {
            System.out.println(real +" - "+ (-img) +"i");
        }
    }
}
public class ComplexNumbersOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter real and imaginary part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex diff = c1.substract(c2);
        Complex prod = c1.product(c2);

        System.out.println("Sum: ");
        sum.print();
        System.out.println("Difference: ");
        diff.print();
        System.out.println("Product: ");
        prod.print();
    }
}
