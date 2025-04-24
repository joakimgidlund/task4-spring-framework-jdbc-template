package se.yrgo.services.customers;

import java.util.List;

import se.yrgo.dataaccess.CustomerDao;
import se.yrgo.domain.Call;
import se.yrgo.domain.Customer;

public class CustomerManagementServiceProductionImpl implements CustomerManagementService {
    CustomerDao customerDao;

    public CustomerManagementServiceProductionImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;    
    }

    @Override
    public void newCustomer(Customer newCustomer) {
        customerDao.create(newCustomer);
    }

    @Override
    public void updateCustomer(Customer changedCustomer) {
        
    }

    @Override
    public void deleteCustomer(Customer oldCustomer) {
        
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
    }    
}
