package com.example.demo.entity.gender;


import com.example.demo.entity.pokemon.PokemonSpecies;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PokemonSpeciesGender {

    private Integer rate;
    private PokemonSpecies pokemon_species;


    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public PokemonSpecies getPokemon_species() {
        return pokemon_species;
    }

    public void setPokemon_species(PokemonSpecies pokemon_species) {
        this.pokemon_species = pokemon_species;
    }


}