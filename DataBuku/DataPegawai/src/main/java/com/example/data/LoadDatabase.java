package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(34567L, "Cemerlang","RidwanCetak",
                    "200hlm", "2000", 50000L )));
            log.info("Preloading" + repository.save(new Data(36789L, "Cita-Cita", "Mediatama",
                    "300hlm", "1999", 45000L )));
            log.info("Preloading" + repository.save(new Data(89765L, "Demokrasi", "Tafaquh",
                    "350hlm", "1998", 30000L )));
        };
    }
}
