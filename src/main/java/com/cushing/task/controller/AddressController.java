package com.cushing.task.controller;

import com.cushing.task.model.Address;
import com.cushing.task.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by IPahomov on 26.07.2016.
 */
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/addresses",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Address>> getAddresses() {
        return new ResponseEntity<Collection<Address>>(addressService.findAll(),
                HttpStatus.OK);
    }

    @RequestMapping(value = "addresses/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> getAddress(@PathVariable Long id) {
        Address address = addressService.findOne(id);
        if (address == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(address, HttpStatus.OK);
    }

    @RequestMapping(value = "/addresses",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        return new ResponseEntity<>(addressService.create(address),
                HttpStatus.CREATED);
    }

    @RequestMapping(value = "/addresses/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        Address updatedAddress = addressService.update(address);
        if (updatedAddress == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(updatedAddress,
                HttpStatus.OK);
    }

    @RequestMapping(value = "/addresses/{id}",
            method = RequestMethod.DELETE)
    public ResponseEntity<Address> deleteAddress(@PathVariable Long id) {
        addressService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
