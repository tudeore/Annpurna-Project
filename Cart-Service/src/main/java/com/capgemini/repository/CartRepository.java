package com.capgemini.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Cart;

@Repository
public interface CartRepository extends MongoRepository<CartRepository, Integer>  {

	void save(Cart cart);

	
}
