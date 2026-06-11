package DAY_03;
import java.util.*;
public class prime {

        public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
           int num = scan.nextInt();

           if(num >0 && num<2)
           {
               System.out.println("Not prime number ");
           }
           else{
               for(int i =2;i<=num;i++)
               {
                   int count =0;
                   for(int j=2;j<i;j++)
                   {
                       if(i%j==0)
                       {
                           count = count+1;
                       }
                   }
                   if(count==0)
                   {
                       System.out.print(i+" ");
                   }
               }
           }
        }

 }
