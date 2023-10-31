import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = Arrays.asList(
            new Employee("Mohammed Almashhor", 25000d),
        new Employee("Manger Fanger", 12000d),
        new Employee("Fakid Alhadi", 12000d),
        new Employee("Ahmet Yilmaz", 20000d));
        for (Employee number : employees) {
            System.out.println(number);
        }
        System.out.println("----------------------------------------");
        Collections.sort(employees);
        writeList(employees);
    }

    private static void writeList(Iterable collection){
    
    for (Object number : collection) {
        System.out.println(number);
    }
    }
}

