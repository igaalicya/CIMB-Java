package OOP.src;

// import java.util.Scanner;
// import OOP.src.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // int salary = 50_000;
        // int overtime = 5;
        // int payPerHours = 100;

        // Employee orang = new Employee();
        // bisa pake var, java yang nentuin type nya
        // var orang = new Employee();

        Employee orang = new Employee(50_000, 100);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input Salary: ");
        // orang.setSalary(scanner.nextInt());

        // System.out.print("Input Overtime: ");
        // orang.setOvertime(scanner.nextInt());

        // System.out.print("Input Pay per Hour: ");
        // orang.setPayPerHour(scanner.nextInt());

        // System.out.println(calculateWage(orang.getSalary(), orang.getOvertime(),
        // orang.getPayPerHour()));

        System.out.println(orang.calculateWage());
        // System.out.println(Employee.employeeCount);
    }

    public static int calculateWage(int salary, int overtime, int payPerHours) {
        return salary + (overtime * payPerHours);
    }

    public static void testing() {
        System.out.println("Testing");
    }
}
