package DAY_17;

public class secondLargest {
         public static void main(String args[])
         {
             int []arr={1,4,6,8,9,45,43,66,11,66};
             int large=arr[0];
             int second=-1;
             for(int i=0;i<arr.length;i++)
             {
                 if(arr[i]>large)
                 {
                     second=large;
                     large=arr[i];
                 }
                 else if(arr[i]<large&&second<arr[i])
                 {
                     second=arr[i];
                 }
             }
             System.out.println("second large element "+second);
         }
}
