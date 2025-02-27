package com.bharath.BankingApplication.repository;
import com.bharath.BankingApplication.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository  extends JpaRepository<Account, Long>{

}
