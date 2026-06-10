package DAY_03;
import java.util.*;
public class prime {

        public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
           int num = scan.nextInt();
           int count =0;
           if(num >0 || num<2)
           {
               System.out.println(num);
           }
           else{
               for(int i =2;i<=25;i++)
               {
                   for(int j=2;j<i;j++)
                   {
                       if(i%j==0)
                       {
                           count = count+1;
                       }
                   }
               }
           }
        }

 }
