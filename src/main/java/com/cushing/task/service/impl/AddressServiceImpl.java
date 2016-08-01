package com.cushing.task.service.impl;

import com.cushing.task.model.Address;
import com.cushing.task.repository.AddressRepository;
import com.cushing.task.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by IPahomov on 26.07.2016.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Collection<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address findOne(Long id) {
        return addressRepository.findOne(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Address create(Address address) {
        return addressRepository.saveAndFlush(address);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Address update(Address address) {
        return addressRepository.saveAndFlush(address);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void delete(Long id) {
        addressRepository.delete(id);
    }
}
