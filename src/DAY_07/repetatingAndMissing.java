package DAY_07;
import java.util.*;
public class repetatingAndMissing {
    public static void main(String[]args){
        int[]arr={10,20,30,40,50,60,70,80};
        int start=0;
        int end=arr.length-1;
        int target=40;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                return;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.print("Element is not Found");
    }
}