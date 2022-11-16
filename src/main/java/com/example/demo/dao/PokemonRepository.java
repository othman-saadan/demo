package com.example.demo.dao;

import com.example.demo.entity.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, Integer> {
}
