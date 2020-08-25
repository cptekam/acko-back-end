package com.acko.apiservice.repository;

import com.acko.apiservice.model.CustomerHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CusomerRespository extends JpaRepository<CustomerHistory, Long> {
    @Query("SELECT p FROM CustomerHistory p WHERE p.phoneNumber = :phoneNumber")
    List<CustomerHistory> findHistory(@Param("phoneNumber") Long phoneNumber);
}
