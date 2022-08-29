package com.example.paymentsystem;

import com.example.paymentsystem.DbInserter.AdminInitializer;
import com.example.paymentsystem.repository.impl.BaseRepositoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class PaymentSystemApplication  implements CommandLineRunner{

    public static void main(String[] args) {

        SpringApplication.run(PaymentSystemApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

        System.out.println(encoder.encode("admin123"));
        System.out.println(encoder.encode("admin12"));
        System.out.println(encoder.encode("admin1"));
    }

}
