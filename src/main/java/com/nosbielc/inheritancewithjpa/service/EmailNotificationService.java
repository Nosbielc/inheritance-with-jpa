package com.nosbielc.inheritancewithjpa.service;

import com.nosbielc.inheritancewithjpa.domain.EmailNotification;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
public interface EmailNotificationService {

    EmailNotification save(EmailNotification emailNotification);

}
