import java.util.*;
class Complex{
    int real;
    int image;
    public Complex(int r, int i){
        real = r;
        image = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.image+b.image));
    }

    public static Complex difference(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.image-b.image));
    }

    public static Complex multiply(Complex a, Complex b){
        return new Complex((a.real*b.real),(a.image*b.image));
    }
    public void calculate(){
        if(real == 0 && image!=0){
            System.out.println(image+"i");
        }
        else if(image == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+image+"i");
        }
    }

}
class ComplexNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two real number :");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Enter Two imaginary number :");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex p = new Complex(r1, i1);
        Complex q = new Complex(r2, i2);
        Complex adds = Complex.add(p, q);
        Complex diff = Complex.difference(p, q);
        Complex prod = Complex.multiply(p, q);
        adds.calculate();
        diff.calculate();
        prod.calculate();
    }
}
