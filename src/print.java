import java.util.*;
public class print {
    public static void main(String args[])

    {
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int age =scan.nextInt();
        scan.nextLine();
        float marks=scan.nextFloat();
        char ch = scan.next().charAt(0);
        double percentage =scan.nextDouble();
        Byte roll = scan.nextByte();
        long phone=scan.nextLong();
        String dep = scan.nextLine();
       // float Height =scan.nextFloat();
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("marks : "+marks);
        System.out.println("grade : "+ch);
        System.out.println("percentage : "+percentage);
        System.out.println("roll : "+roll);
        System.out.println("phone : "+phone);
        System.out.println("Department : "+dep);
       System.out.println(" ");




    }

}
