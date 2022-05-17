/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Manager.ManagerCus;
import model.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author AD
 */
public class ServiceCustomer {
    private ManagerCus managerCus;
    public ServiceCustomer(){
        managerCus = new ManagerCus();
    }
    public List<Customer> getAllCustomers() throws SQLException{
        return managerCus.getAllCustomers();
    }
    public Customer getCustomer(int sdt) throws SQLException{
        return managerCus.getCustomerById(sdt);
    }
    public void deleteCustomer(String id) throws SQLException{
        managerCus.deleteCustomer(id);
    }
    public void updateCustomer(Customer customer) throws SQLException{
        managerCus.updateCustomer(customer);
    }
    public Customer findCustomer(Customer customer) throws SQLException{
        return managerCus.findCustomer(customer);
    }
}
