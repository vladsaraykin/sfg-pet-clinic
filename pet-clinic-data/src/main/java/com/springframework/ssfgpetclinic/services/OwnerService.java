package com.springframework.ssfgpetclinic.services;

import com.springframework.ssfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner saver(Owner owner);

    Set<Owner> findAll();
}
