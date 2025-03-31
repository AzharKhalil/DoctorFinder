package com.doctorfinder.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Practice;

@Repository
public interface PracticeRepo extends CrudRepository<Practice, Integer>{

}
