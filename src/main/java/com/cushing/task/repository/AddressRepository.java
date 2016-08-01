package com.cushing.task.repository;

import com.cushing.task.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IPahomov on 26.07.2016.
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
