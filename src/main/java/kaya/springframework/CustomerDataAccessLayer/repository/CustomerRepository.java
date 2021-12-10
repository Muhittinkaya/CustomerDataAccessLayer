package kaya.springframework.CustomerDataAccessLayer.repository;

import kaya.springframework.CustomerDataAccessLayer.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
