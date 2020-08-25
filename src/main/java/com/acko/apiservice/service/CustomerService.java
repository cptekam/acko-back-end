package com.acko.apiservice.service;

import com.acko.apiservice.model.CustomerHistory;
import com.acko.apiservice.repository.CusomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CusomerRespository respository;

    public CustomerService() {

    }

    public List<CustomerHistory> getCustomerHistory(Long phoneNumber) {
        return respository.findHistory(phoneNumber);
    }

}
