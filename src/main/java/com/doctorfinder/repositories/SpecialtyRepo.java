package com.doctorfinder.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Specialty;

@Repository
public interface SpecialtyRepo extends CrudRepository<Specialty, Integer>{

}
