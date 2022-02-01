package com.bank.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.main.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
