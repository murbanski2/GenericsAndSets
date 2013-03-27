package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author murbanski
 */
public class Lab1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Stevens", "Darin", "111-22-3333");
        Employee e2 = new Employee("Tate", "Larry", "222-33-4444");
        Employee e3 = new Employee("Stevens", "Darin", "111-22-3333");
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for(Employee emp:employees  ) {
            System.out.println(emp);
        }
        
        List<Employee> li = new ArrayList<Employee>(employees);
        
        for(Employee emp:li) {
            System.out.println(emp);
            
        }
        
    }
}
