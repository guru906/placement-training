package DAY_08;

public class searchingmethods {
    public static void main(String args[])
    {
        String  mail="admin.support@gmail.com";
        System.out.println(mail.contains("@"));
        System.out.println(mail.indexOf('.'));
        System.out.println(mail.lastIndexOf('.'));
        System.out.println(mail.startsWith("admin"));
        System.out.println(mail.endsWith("com"));

    }
}
