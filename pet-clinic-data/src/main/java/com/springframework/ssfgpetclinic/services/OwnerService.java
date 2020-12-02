package com.springframework.ssfgpetclinic.services;

import com.springframework.ssfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
