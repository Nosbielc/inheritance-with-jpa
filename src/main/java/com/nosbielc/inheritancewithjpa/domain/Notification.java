package com.nosbielc.inheritancewithjpa.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Cleibson Gomes (https://github.com/Nosbielc) ON 05/03/2020
 * @project inheritance-with-jpa
 */
@Data
@Entity
@Table(name = "notification")
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Notification {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Temporal( TemporalType.TIMESTAMP )
    @CreationTimestamp
    @Column(name = "created_on")
    private Date createdOn;

}
