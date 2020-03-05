package com.nosbielc.inheritancewithjpa.service;

import com.nosbielc.inheritancewithjpa.domain.SmsNotification;
import com.nosbielc.inheritancewithjpa.repository.SmsNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
@Service
public class SmsNotificationServiceImpl implements SmsNotificationService {

    private SmsNotificationRepository smsNotificationRepository;

    @Autowired
    public SmsNotificationServiceImpl(SmsNotificationRepository smsNotificationRepository) {
        this.smsNotificationRepository = smsNotificationRepository;
    }

    @Override
    public SmsNotification save(SmsNotification smsNotification) {
        return this.smsNotificationRepository.save(smsNotification);
    }

}
