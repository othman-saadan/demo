package com.example.demo.service;

import com.example.demo.entity.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PokemonService {
    final WebClient client = WebClient.builder()
            .baseUrl("https://pokeapi.co/api/v2").build();

    public Mono<Pokemon> getPokemonByName(String name) {
        return client.get()
                .uri("/pokemon/" + name)
                .retrieve()
                .bodyToMono(Pokemon.class)
                ;
    }

    public Flux<Pokemon> getAll() {
        return client.get()
                .uri("/pokemon")
                .retrieve()
                .bodyToFlux(Pokemon.class)
                ;
    }
/*
    public Flux<Gender> getAllPokemonsGender() {
        Flux<PokemonSpeciesGender> listSpeciesGendreF = Flux.fromStream(Stream.of(
                new PokemonSpeciesGender(null, new PokemonSpecies(1, "pok1")), new PokemonSpeciesGender(null, new PokemonSpecies(2, "pok2"))));
        Flux<PokemonSpeciesGender> listSpeciesGendreM = Flux.fromStream(Stream.of(
                new PokemonSpeciesGender(null, new PokemonSpecies(3, "pok3"))));
        Flux<Gender> genderFlux = Flux.fromStream(Stream.of(
                new Gender(1, "female", listSpeciesGendreF),
                new Gender(2, "male", listSpeciesGendreM)));
        return genderFlux;
    }
*/
/*
    public Flux<Pokemon> getAllPokemons() {
        Flux<Pokemon> pokemonFlux = Flux.fromStream(Stream.of(
                new Pokemon(1, 4, "pok1", null, 200),
                new Pokemon(2, 7, "pok2", null, 325),
                new Pokemon(3, 7, "pok3", null, 123)));
        return pokemonFlux;
    }

*/
                                                      /* public Flux<Pokemon> getPokemonsByGender(String gendre) {
        return client.get()
                .uri("/gender/", gendre)
                .retrieve()
                .bodyToFlux(Pokemon.class)
                .limitRate(5)
                .map(PokemonSpeciesGender::getPokemon_species)
                .map(PokemonSpecies::getName)
                .map(this::getByName);
}*/
}
