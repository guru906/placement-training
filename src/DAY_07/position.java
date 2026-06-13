package DAY_07;
import java.util.*;
public class position{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int n= scan.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
          arr[i]=scan.nextInt();
      }
      System.out.println("ENTER YOUR POSITION ");
      int pos =scan.nextInt();
      System.out.println("ENTER YOUR VALUE ");
      int value =scan.nextInt();
      int arr1[] =new int[n+1];
      for(int i=0;i<pos;i++)
      {
          arr1[i]=arr[i];
      }
      arr1[pos]=value;
      for(int i=pos+1;i<arr1.length;i++)
      {
          arr1[i]=arr[i-1];
      }
      System.out.println(Arrays.toString(arr1));

    }
}