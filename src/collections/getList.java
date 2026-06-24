package collections;
import java.util.*;
public class getList {
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            int ans=scan.nextInt();
            list.add(ans);
        }
        System.out.println("enter your index ");
        int Get=scan.nextInt();
      System.out.println(list.get(Get));
      System.out.println("ENTER THE VALUE IF YOU WANT TO CHANGE ");
      int Set=scan.nextInt();
        System.out.println("enter your index ");
        int val =scan.nextInt();
        System.out.println(list.set(Set,val ));





    }
}
