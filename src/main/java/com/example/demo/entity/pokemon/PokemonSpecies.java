package com.example.demo.entity.pokemon;

import com.example.demo.entity.PokeApiResource;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PokemonSpecies implements PokeApiResource {

    private Integer id;
    private String name;


}

