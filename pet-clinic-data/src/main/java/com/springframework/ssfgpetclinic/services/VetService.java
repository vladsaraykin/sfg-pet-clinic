package com.springframework.ssfgpetclinic.services;

import com.springframework.ssfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet saver(Vet vet);

    Set<Vet> findAll();
}
