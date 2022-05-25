/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import model.Employee;
import Manager.ManagerEmp;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author AD
 */
public class EmployeeService {
    private ManagerEmp managerEmp;
    public EmployeeService(){
        managerEmp = new ManagerEmp();
    }
    public List<Employee> getAllEmployees() throws SQLException{
        return managerEmp.getAllEmployees();
    }
    public void addEmployee(Employee employee) throws SQLException{
        managerEmp.addEmployee(employee);
    }
    public void deleteEmployee(String id) throws SQLException{
        managerEmp.deleteEmployee(id);
    }
    public void updateEmployee(Employee employee) throws SQLException{
        managerEmp.updateEmployee(employee);
    }
    public Employee getEmployeeById(String id) throws SQLException{
        return managerEmp.getEmployeeById(id);
    }
}
