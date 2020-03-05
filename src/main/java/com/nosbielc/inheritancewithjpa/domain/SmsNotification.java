package com.nosbielc.inheritancewithjpa.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
@Data
@Entity
@Table(name = "sms_notification")
public class SmsNotification
        extends Notification {

    @Column(
            name = "phone_number",
            nullable = false
    )
    private String phoneNumber;

}
