package com.bank.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.main.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

}
