package ie.mohammed.service;

import java.util.List;

import ie.mohammed.model.Customer;

public interface CustomerService {
	int CountTotalCustomer();

	int CustomerByName(String lastName);

	Customer findById(int customerId);

	// void insertCustomer(String firstName, String lastName, String address, String
	// city, String contactNumber, String email);
	void saveACustomer(String title, String firstName, String lastName, String address, String city,
			String contactNumber, String email, String password);

	int changeCustomerName(String oldTitle, String newTitle, String oldFirstName, String newFirstName,
			String oldLastName, String newLastName, String oldAddress, String newAddress, String oldCity,
			String newCity, String oldContactNumber, String newContactNumber, String oldEmail, String newEmail, String oldPassword, String newPassword);

	void createACustomer(Customer c);

	List<Customer> findAllCustomer();

}
