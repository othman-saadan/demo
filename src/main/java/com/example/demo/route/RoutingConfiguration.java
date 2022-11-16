package com.example.demo.route;

import com.example.demo.handler.PokemonHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class RoutingConfiguration {
    @Bean
    public RouterFunction<ServerResponse> root(PokemonHandler handler) {
        return RouterFunctions.route()
                .GET("/pokemons", handler::getAllPokemon)
                .GET("/pokemons/{name}", handler::getPokemon)
                .build();
    }

                                                                
}