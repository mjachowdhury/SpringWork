import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ie.mohammed.dao.AccountDao;
import ie.mohammed.dao.CustomerDao;
import ie.mohammed.dao.EmployeeDao;
import ie.mohammed.model.Customer;

class AllTestsTest {

	@Autowired
	CustomerDao customerDao;
	EmployeeDao employeeDao;
	AccountDao accountDao;
	
	@Test
	public void testFindCustomerName() {
		Customer cus = customerDao.findById(1);
		Assert.assertEquals("Alom", cus.getLastName());
	}
	
	@Test
	public void testCountingTotalCustomer() {
		int count = customerDao.getCustomerCount();
		Assert.assertEquals(3, count);
	}
	
	@Test
	public void testEmployeeInsert() {
		int numberOfEmployee = employeeDao.getEmployeeCount();
		employeeDao.insertANewEmployee("Hassan", "Sardar", "123456");
		int itShouldBe = numberOfEmployee +1;
		numberOfEmployee = employeeDao.getEmployeeCount();
		Assert.assertEquals(itShouldBe, numberOfEmployee);
		
	}
	
	@Test
	public void testFindAllCustomer() {
		int numberOfCustomer = customerDao.getCustomerCount();
		Assert.assertEquals(2, numberOfCustomer);
	}
	
	@Test
	public void testIsCustomerInDatabase() {
		Assert.assertEquals(true, accountDao.accountExists(555555));
		Assert.assertEquals(false, accountDao.accountExists(888888));
		
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
