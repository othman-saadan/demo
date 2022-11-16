package com.example.demo.handler;

import com.example.demo.entity.Pokemon;
import com.example.demo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PokemonHandler {
    @Autowired
    PokemonService metier;

    /*   public Mono<ServerResponse> getAllPokemonGender(ServerRequest request) {
           return ServerResponse.ok().body(metier.getAllPokemonsGender(), Pokemon.class);
       }
   */
    public Mono<ServerResponse> getAllPokemon(ServerRequest request) {
        return ServerResponse.ok().body(metier.getAll(), Pokemon.class);
    }

    public Mono<ServerResponse> getPokemon(ServerRequest request) {
        String namePokemon = request.pathVariable("name");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(metier.getPokemonByName(namePokemon), Pokemon.class);
    }
    //PokemonHandler c'est préferable de
  /*  public Mono<ServerResponse> getGender(ServerRequest request) {
        String nameGender = request.pathVariable("name");
        return ServerResponse.ok().body(metier.getPokemonGender(nameGender), Pokemon.class);
    }*/
}
