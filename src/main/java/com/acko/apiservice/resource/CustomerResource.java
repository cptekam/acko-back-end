package com.acko.apiservice.resource;

import com.acko.apiservice.model.CustomerHistory;
import com.acko.apiservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    CustomerService customerService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/history/{phoneNumber}")
    public ResponseEntity<?> getCustomerHistory(@PathVariable Long phoneNumber) {
        List<CustomerHistory> histories = customerService.getCustomerHistory(phoneNumber);
        return ResponseEntity.ok()
                        .body(histories);
    }


}
