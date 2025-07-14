package workshop.employeeManagement;
import workshop.employeeManagement.employee;
public class employeeSelf extends employeeOwner {
     @Override
     public employee getEmployeeDetails(int employeeId) {
        if (!employees.containsKey(employeeId)) {
            System.out.println("Employee with ID " + employeeId + " does not exist.");
            return null;
         return super.getEmployeeDetails(employeeId);
        }
    }
}
