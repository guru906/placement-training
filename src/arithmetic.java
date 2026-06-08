import java.util.*;
public class arithmetic {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        //addition
        System.out.println("Addition : "+(a+b));
        System.out.println("Subraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        //Area and perimeter of triangle
        System.out.println("_____________TRIANGLE ___________");
        int bR=scan.nextInt();
        int h=scan.nextInt();
        int s1=scan.nextInt();
        int s2=scan.nextInt();
        int s3=scan.nextInt();
        int perimeter = s1+s2+s3;

        System.out.println("PERIMETER OF TRIANGLE : "+perimeter);

        System.out.println("AREA OF TRIANGLE : "+(0.5*bR*h));
        System.out.println("_________________RECTANGLE__________________");
        int L=scan.nextInt();
        int B=scan.nextInt();
        System.out.println("PERIMETER OF RECTANGLE : "+(2*(L+B)));

        System.out.println("AREA OF RECTANGLE  : "+(L*B));

    }
}
