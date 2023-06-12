package Java_Basic_And_OOP.H_Basic_OOP.Exercise5;

public class Main {
    // compute salary of Felix
        // compute salary of Felix
        public static void main(String[] args) {
            // compute salary of Felix
        Employee employee1 = new Employee("Felix", 25213.53);

        // increase salary by 20%
        employee1.setSalary(20.00);
        double newSalary = employee1.getSalary();
        System.out.println("Name: " + employee1.name + "\nNew Salary: " + newSalary);

        // compute salary of Maria
        Employee employee2 = new Employee("Maria", 873223.32);

        // increase salary by 15.37%
        employee2.setSalary(15.37);
        newSalary = employee2.getSalary();
        System.out.println("Name: " + employee2.name + "\nNew Salary: " + newSalary);
        }
}
