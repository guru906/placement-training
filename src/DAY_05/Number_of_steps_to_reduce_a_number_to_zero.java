package DAY_05;
import java.util.*;
public class Number_of_steps_to_reduce_a_number_to_zero {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int count =0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }
            else{
                num = num-1;
                count++;
            }
        }
        System.out.println("NUMBER OF STEPS : "+count);

    }
}
