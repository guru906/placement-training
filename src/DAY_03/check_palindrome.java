package DAY_03;

public class check_palindrome {
    public static void main(String args[])
    {
        int sum=0;
        int num =121;
        int num1=num;
        while(num!=0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if(num1 == sum) {
            System.out.println("THE NUMBER IS PALINDROME ");
        }
        else{
            System.out.println("THE NUMBER IS NOT PALINDROME ");
    }
    }
}
