package com.cushing.task.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.GregorianCalendar;

/**
 * Created by IPahomov on 26.07.2016.
 */
@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private GregorianCalendar birthDate;

}
