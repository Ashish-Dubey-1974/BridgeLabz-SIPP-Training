package workshop.employeeManagement;
import java.util.*;
public class employeeOwner implements employee {
    HashMap<Integer,employee> employees = new HashMap<>();
    int employeeId;
    String name;
    String position;
    private void addEmployee(String name, String position, int employeeId) {
        if(employees.containsKey(employeeId)) {
            System.out.println("Employee with ID " + employeeId + " already exists.");
            return;
        }
        employees.put(employeeId, this);
        this.name = name;  
        this.position = position;
        this.employeeId = employeeId;
        System.out.println("Employee" +name + "added: ");
    }
    private void removeEmployee(int employeeId) {
    if(!employees.containsKey(employeeId)) {
        System.out.println("Employee with ID " + employeeId + " does not exist.");
        return;
    }
    employees.remove(employeeId);
    this.name = null;
    this.position = null;
    this.employeeId = 0;
        System.out.println("Employee removed with ID: " + employeeId);
    }
    @Override
    public employee getEmployeeDetails(int employeeId) {
        if(!employees.containsKey(employeeId)) {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
            return null;
        }
        employee emp = employees.get(employeeId);
        return emp;
    }
    
}
