import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Side");
        int a=sc.nextInt();

        System.out.println("Enter 2nd Side");
        int b=sc.nextInt();

        System.out.println("Enter 3rd side");
        int c=sc.nextInt();

        //Using Heron's Formula

        if((a+b)>c && (b+c)>a && (a+c)>b)
        {
            int p=(a+b+c)/2;
            int q=(p*(p-a)*(p-b)*(p-c));
            double area=Math.sqrt(q);
            System.out.println("Area of Triangle is: " + area);
        }

    }
}
