import java.util.Scanner;

class Employee {

    private final String name;
    private int age;
    private float salary;

    Employee(String name, int age, float salary) {

        this.name = name;

        if (age <= 5) {
            throw new IllegalArgumentException("Age must be higher  than 5");
        }
        this.age = age;

        if (salary < 150000) {
            throw new IllegalArgumentException("Salary must be at least 150000");
        }
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter salary: ");
            float salary = sc.nextFloat();

            Employee e = new Employee(name, age, salary);
            e.display();
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Program Ended");
        }

        sc.close();
    }
}
