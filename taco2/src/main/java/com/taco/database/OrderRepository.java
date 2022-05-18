package com.taco.database;

import org.springframework.data.repository.CrudRepository;

import com.taco.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
