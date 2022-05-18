package com.taco.database;

import org.springframework.data.repository.CrudRepository;

import com.taco.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{

}
