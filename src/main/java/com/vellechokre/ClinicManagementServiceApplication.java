package com.vellechokre;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vellechokre.config.SecurityAuditorAware;

/**
 * Project clinic-management-service
 *
 * @author nishant.bhardwaz
 * @version 1.0
 * @date Aug 28, 2019
 */
@SpringBootApplication
@EnableJpaRepositories("com.vellechokre")
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
@ComponentScan(basePackages = "com.vellechokre")
public class ClinicManagementServiceApplication {

    private static final Logger logger =
            LoggerFactory.getLogger(ClinicManagementServiceApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(ClinicManagementServiceApplication.class, args);
    }

    @Bean
    public AuditorAware<String> auditorProvider() {

        return new SecurityAuditorAware();
    }

    @Bean
    public DateTimeProvider dateTimeProvider() {

        return CurrentDateTimeProvider.INSTANCE;
    }

    private void test() {

    }
}
