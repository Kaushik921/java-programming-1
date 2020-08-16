import java.util.Scanner;

interface calculate
{
    int cal(int a,int b);
}


public class Question1 {
    public static void main(String[] args)
    {
        calculate add=(a,b)->(a+b);
        calculate diff=(int a,int b)->(a-b);
        calculate multiply=(int a,int b)->(a*b);
        calculate safediv=(int a,int b)->(a/b);

//        System.out.println("Sum"+add.cal(5,4));
//        System.out.println("Difference"+diff.cal(10,5));
//        System.out.println("Multiplication"+multiply.cal(7,8));
//        System.out.println("Division"+safediv.cal(10,5));

        System.out.println("1.Addition\n2.Difference\n3.Product\n4.SafeDivision");
        System.out.println("Enter the option");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();


        switch (n)
        {
            case 1:System.out.println("Sum: "+add.cal(5,4));
                break;
            case 2:System.out.println("Difference: "+diff.cal(10,5));
                break;
            case 3:System.out.println("Multiplication: "+multiply.cal(7,8));
                break;
            case 4:System.out.println("Division: "+safediv.cal(10,5));
                break;
        }



    }
}
