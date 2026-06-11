package DAY_05;
import java.util.*;
public class withoutArgwithoutRet {
    public static void main(String args[])
    {
        StudentDetails();
    }
    public static void StudentDetails()
    {
        Scanner scan = new Scanner(System.in);
        String st=scan.nextLine();
        Long num =scan.nextLong();
        scan.nextLine();
        String dep = scan.nextLine();
        System.out.println("NAME : "+st);
        System.out.println("ROLL NUM : "+num);
        System.out.println("dep : "+dep);
    }
}
