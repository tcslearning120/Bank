package com.bank.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.main.entity.Deposite;

@Repository
public interface DepositeRepository extends CrudRepository<Deposite, Integer> {

}
