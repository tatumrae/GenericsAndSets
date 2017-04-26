package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Tatum Thomas
 */
public class Startup {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Thomas", "Tatum", "123-45-6789");
        Employee employee2 = new Employee("Smith", "Bob", "555-55-5555");
        Employee employee3 = new Employee("Jones", "Jane", "000-00-0000");
        Employee employee4 = new Employee("Smith", "Lisa", "987-65-4321");
        
        // without generics - Lab #2
        List employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        
        for(Object obj : employeeList) {
            Employee e = (Employee)obj;
            System.out.println(e);
        }
        
        // with generics - Lab #3
        List<Employee> employeeListGenerics = new ArrayList<Employee>();
        employeeListGenerics.add(employee1);
        employeeListGenerics.add(employee2);
        employeeListGenerics.add(employee3);
        employeeListGenerics.add(employee4);
        
        for(Employee e2 : employeeListGenerics) {
            System.out.println(e2);
        }
        
        // dogs in sets - Lab #4
        Dog boxer = new Dog("Bentley", 1);
        Dog americanBulldog = new Dog("Bella", 2);
        Dog boxer2 = new Dog("Bella", 2);
        Dog husky = new Dog("Kobe", 3);
        
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(boxer);
        dogList.add(americanBulldog);
        dogList.add(boxer2);
        dogList.add(husky);
        
        Set<Dog> noDupes = new HashSet<Dog>(dogList);
        dogList = new ArrayList(noDupes);
        
        for(Dog dog :dogList) {
            System.out.println(dog);
        }
        
    }
}
