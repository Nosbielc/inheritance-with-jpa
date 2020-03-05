package com.nosbielc.inheritancewithjpa;

import com.nosbielc.inheritancewithjpa.domain.EmailNotification;
import com.nosbielc.inheritancewithjpa.domain.SmsNotification;
import com.nosbielc.inheritancewithjpa.service.EmailNotificationService;
import com.nosbielc.inheritancewithjpa.service.SmsNotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */

@SpringBootApplication
public class InheritanceWithJpaApplication {

    private SmsNotificationService smsNotificationService;
    private EmailNotificationService emailNotificationService;

    public InheritanceWithJpaApplication(SmsNotificationService smsNotificationService,
                                         EmailNotificationService emailNotificationService) {
        this.smsNotificationService = smsNotificationService;
        this.emailNotificationService = emailNotificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InheritanceWithJpaApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return (args) -> {

            SmsNotification sms = new SmsNotification();
            sms.setPhoneNumber( "081-93889-6790" );
            sms.setFirstName( "Nosbielc" );
            sms.setLastName( "Gomes" );

            smsNotificationService.save( sms );

            EmailNotification email = new EmailNotification();
            email.setEmailAddress( "gomes@nosbielc.com" );
            email.setFirstName( "Nosbielc" );
            email.setLastName( "Gomes" );

            emailNotificationService.save( email );

        };
    }

}
