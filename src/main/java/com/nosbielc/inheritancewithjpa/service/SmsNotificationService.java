package com.nosbielc.inheritancewithjpa.service;

import com.nosbielc.inheritancewithjpa.domain.EmailNotification;
import com.nosbielc.inheritancewithjpa.domain.SmsNotification;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
public interface SmsNotificationService {

    SmsNotification save(SmsNotification smsNotification);

}
