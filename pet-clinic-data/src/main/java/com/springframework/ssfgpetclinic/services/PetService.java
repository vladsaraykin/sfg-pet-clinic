package com.springframework.ssfgpetclinic.services;

import com.springframework.ssfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet saver(Pet pet);

    Set<Pet> findAll();
}
