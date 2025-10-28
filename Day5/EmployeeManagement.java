package Day5;

import java.util.*;
import java.io.*;

class Employee implements Serializable {
    private String empName;
    private int empID;
    private String empRole;

    public Employee() {
        this.empName = "Unknown";
        this.empID = 0;
        this.empRole = "Not Assigned";
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee";
    }

    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    public int getEmpID() { return empID; }
    public String getEmpName() { return empName; }
    public String getEmpRole() { return empRole; }

    @Override
    public String toString() {
        return "Employee ID: " + empID + ", Name: " + empName + ", Role: " + empRole;
    }
}

public class EmployeeManagement {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==== Employee Management System ====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show All Employees (Sorted by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> removeEmployee();
                case 3 -> showAllEmployees();
                case 4 -> showSortedEmployees();
                case 5 -> findEmployeeByName();
                case 6 -> saveToFile();
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 7);
    }

    // Add Employee
    public static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Role (or press Enter for default): ");
        String role = sc.nextLine();

        Employee emp;
        if (role.isEmpty())
            emp = new Employee(id, name);
        else
            emp = new Employee(id, name, role);

        employeeList.add(emp);
        System.out.println("Employee added successfully!");
    }

    // Remove Employee
    public static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();
        boolean removed = employeeList.removeIf(emp -> emp.getEmpID() == id);
        if (removed)
            System.out.println("Employee removed successfully!");
        else
            System.out.println("Employee not found.");
    }

    // Show All Employees
    public static void showAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to show.");
            return;
        }
        System.out.println("\n-- Employee List --");
        for (Employee emp : employeeList)
            System.out.println(emp);
    }

    // Show Sorted Employees
    public static void showSortedEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        ArrayList<Employee> sortedList = new ArrayList<>(employeeList);
        sortedList.sort(Comparator.comparingInt(Employee::getEmpID));
        System.out.println("\n-- Sorted Employee List (by ID) --");
        for (Employee emp : sortedList)
            System.out.println(emp);
    }

    // Find Employee by Name
    public static void findEmployeeByName() {
        System.out.print("Enter Employee Name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getEmpName().equalsIgnoreCase(name)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found)
            System.out.println("No employee found with name: " + name);
    }

    // Save Employees to File
    public static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employeeList);
            System.out.println("Employee list saved successfully to 'employees.dat'.");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}
