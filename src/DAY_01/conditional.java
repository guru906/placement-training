package DAY_01;
import java.util.*;
public class conditional {
    public static void main(String args[]) {
        Scanner scan =new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>=90)
        {
            System.out.println("GRADE A ");
        }
        else if(mark>=75 && mark<90)
        {
            System.out.println("GRADE B");
        }
        else if(mark>=50 && mark<75)
        {
            System.out.println("GRADE C");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
