package com.mahendra.DMS.repositoty;

import org.springframework.data.repository.CrudRepository;

import com.mahendra.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog , Integer>{

}
