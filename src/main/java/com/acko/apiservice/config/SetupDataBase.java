package com.acko.apiservice.config;

import com.acko.apiservice.model.CustomerHistory;
import com.acko.apiservice.repository.CusomerRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetupDataBase {

    @Bean
    CommandLineRunner initDatabase(CusomerRespository repository) {

        return args -> {
            System.out.println("Preloading " + repository.save(new CustomerHistory(123456789L, "Health", 0, 0.0,
                            0, 0, 0.0)));
            System.out.println("Preloading " + repository.save(new CustomerHistory(123456789L, "Life Insurance", 1, 44.27,
                            0, 0, 24.0)));
            System.out.println("Preloading " + repository.save(new CustomerHistory(123456789L, "Motor Insurance", 1, 1245.0,
                            0, 0, 0.0)));
        };
    }
}
