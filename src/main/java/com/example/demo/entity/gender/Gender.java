package com.example.demo.entity.gender;


import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;

@Data
@AllArgsConstructor
public class Gender {

    private Integer id;
    private String name;
    private Flux<PokemonSpeciesGender> pokemon_species_details;

}