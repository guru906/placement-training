package maps;
import java.util.*;
public class mobileApplicaation {
    public static void main(String []args) {
        Map<String, Integer> person = new LinkedHashMap<>();
        person.put("guru", 123);
        person.put("prasanth", 456);
        person.put("aswin",789);
        person.put("logu",135);
        person.put("harish",682);
        System.out.println(person);
        System.out.println(person.get("aswin"));




    }


}
