package com.bank.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.main.entity.Withdraw;

@Repository
public interface WithdrawRepository extends CrudRepository<Withdraw, Integer>{

}
