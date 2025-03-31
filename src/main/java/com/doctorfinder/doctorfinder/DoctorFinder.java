/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.doctorfinder.doctorfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author azhar
 */
@SpringBootApplication
@EnableJpaRepositories("com.doctorfinder.repositories")
@ComponentScan("com.doctorfinder")
@EntityScan("com.doctorfinder.entities")
public class DoctorFinder {

    public static void main(String[] args) {
        SpringApplication.run(DoctorFinder.class, args);
    }
}
