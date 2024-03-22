
/***Employee Inheritance Override: Create a superclass Employee with attributes name and salary, and a method calculateBonus() that returns 0. Then, create a subclass Manager that extends Employee and overrides the calculateBonus() method to return 10% of the salary.
 *  Similarly, create another subclass Engineer that overrides the calculateBonus() method to return 5% of the salary. 
 *  Test this hierarchy by creating instances of Manager and Engineer, setting their salaries, and calling the calculateBonus() method to ensure the correct bonus calculation.
 *  
 * package com.aaslin.bonus;
 * @author Reshmika bandaru
 * 
 *
 */
package com.aaslin.bonus;
class Employee {
    String name;
    double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public double calculateBonus() {
        return 0.1 * salary;
    }
}

class Engineer extends Employee {
    public Engineer(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public double calculateBonus() {
        return 0.05 * salary;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Manager manager = new Manager("RESHMI", 50000);
        Engineer engineer = new Engineer("HARSHITHA", 60000);
        
        System.out.println(manager.name + "  bonus:  " + manager.calculateBonus());
        System.out.println(engineer.name + "  bonus:  " + engineer.calculateBonus());
    }
}
