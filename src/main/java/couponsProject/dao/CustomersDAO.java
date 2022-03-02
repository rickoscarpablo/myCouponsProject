package couponsProject.dao;

import couponsProject.beans.Customer;

import java.util.List;
import java.util.Map;


    public interface CustomersDAO {

        boolean isCustomerExist(String email, String password);

        boolean addCustomer(Customer customer);

        boolean updateCustomer(Customer customer);

        void deleteCustomer(int customer_id);

        List<Customer> getAllCustomers(String sql, Map<Integer, Object> values);

        Customer getOneCustomer(int customer_id);

}
