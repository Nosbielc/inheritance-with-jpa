package com.nosbielc.inheritancewithjpa.repository;

import com.nosbielc.inheritancewithjpa.domain.SmsNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
@Repository
public interface SmsNotificationRepository extends JpaRepository<SmsNotification, Long> {

    @Transactional
    SmsNotification save(SmsNotification smsNotification);

}
