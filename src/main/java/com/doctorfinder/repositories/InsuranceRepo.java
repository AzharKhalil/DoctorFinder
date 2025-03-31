package com.doctorfinder.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Insurance;

@Repository
public interface InsuranceRepo extends CrudRepository<Insurance, Integer> {

}
