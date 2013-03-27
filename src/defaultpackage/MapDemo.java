package defaultpackage;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author murbanski
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<String, Employee>();
        Map<String, List> map2 = new HashMap<String, List>();
        
        Employee e1 = new Employee("Jones", "Bob", "333-33-3333");
        Employee e2 = new Employee("Smith", "Sally", "444-44-4444");
        
        List<Employee> empList = new ArrayList<Employee>();
        map.put("333-33-3333", e1);
        map.put("444-44-4444", e2);
        
        Employee emp = map.get("444-44-4444");
        System.out.println(emp);
        
        empList.add(e1);
        empList.add(e2);
        
        map2.put("employee list", empList);
        empList = map2.get("employee list");
        System.out.println(empList);
        System.out.println(empList.get(1));
        System.out.println(empList);
        
    }
}
