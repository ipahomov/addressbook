package com.cushing.task.service;

import com.cushing.task.model.Address;

import java.util.Collection;

/**
 * Created by IPahomov on 26.07.2016.
 */
public interface AddressService {

    Collection<Address> findAll();

    Address findOne(Long id);

    Address create(Address address);

    Address update(Address address);

    void delete(Long id);
}
