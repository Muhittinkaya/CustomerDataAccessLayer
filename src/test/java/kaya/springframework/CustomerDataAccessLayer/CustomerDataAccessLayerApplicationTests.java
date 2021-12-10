package kaya.springframework.CustomerDataAccessLayer;

import kaya.springframework.CustomerDataAccessLayer.entity.Customer;
import kaya.springframework.CustomerDataAccessLayer.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
class CustomerDataAccessLayerApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john@gmail.com");
		customerRepository.save(customer);
	}

	@Test
	void testUpdateCustomer(){
		Customer customer = customerRepository.findById(1L).get();
		customer.setEmail("john_smith@gmail.com");
		customerRepository.save(customer);

		System.out.println(customer);

	}

	@Test
	void testReadCustomer(){
		Customer customer = customerRepository.findById(1L).get();
		System.out.println(customer);
	}

	@Test
	void testDeleteCutomer(){
		Customer customer = customerRepository.findById(1L).get();
		customerRepository.delete(customer);
		System.out.println("DELETED CUSTOMER");
	}

}
