package com.bank.main;
import org.springframework.data.repository.CrudRepository;

import com.bank.main.entity.UserData;




public interface BankUserRepository extends CrudRepository<UserData,Integer> {

}
