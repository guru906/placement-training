package collections;
import java.util.*;
public class Arraylist {
    public static void main(String args[])
    {
      ArrayList<Integer>list=new ArrayList<>();
      Scanner scan = new Scanner(System.in);
      for(int i=1;i<=5;i++)
      {
          int a=scan.nextInt();
          list.add(a);
      }
      System.out.println(list);
    }
}
