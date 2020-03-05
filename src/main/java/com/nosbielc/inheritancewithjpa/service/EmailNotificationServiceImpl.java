package com.nosbielc.inheritancewithjpa.service;

import com.nosbielc.inheritancewithjpa.domain.EmailNotification;
import com.nosbielc.inheritancewithjpa.repository.EmailNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
@Service
public class EmailNotificationServiceImpl implements EmailNotificationService {

    private EmailNotificationRepository emailNotificationRepository;

    @Autowired
    public EmailNotificationServiceImpl(EmailNotificationRepository emailNotificationRepository) {
        this.emailNotificationRepository = emailNotificationRepository;
    }

    @Override
    public EmailNotification save(EmailNotification emailNotification) {
        return this.emailNotificationRepository.save(emailNotification);
    }

}
