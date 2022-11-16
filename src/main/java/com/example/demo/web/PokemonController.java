/*
package com.example.demo.web;

import com.example.demo.service.PokemonDetailApp;
import com.example.demo.service.PokemonSearchApp;
import com.example.demo.dao.PokemonRepository;
import com.example.demo.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.RedirectView;
import reactor.core.publisher.Mono;

import java.io.IOException;

@Controller
public class PokemonController {

    */
/*
 * Dans la programmation réactive les requetes sont traitées d'une maniere asynchone à l'aide
 * du reactor (design pattern).
 * MongodbReactor : c'est un driver qui permet de la connexion entre l'application et le SGBD d'une manier aussi asynchon en utilisant
 * le desgin pattern Reactor implécitement
 *
 * *//*


    PokemonSearchApp pokemonSearchApp = new PokemonSearchApp();
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/")
    public String index(Model model) {
        return "/index";
    }

    @GetMapping(path = "/search")
    public String search(Model model) {
        model.addAttribute("message_entre", "Veuillez saisir le nom de Pokemon");
        return "search";
    }

    PokemonDetailApp metier = new PokemonDetailApp();

    @GetMapping(path = "/detail")
    public String detail(Model model, String name) {
        Mono<Pokemon> pokemon = metier.getByName(name);
        model.addAttribute("pokemon", pokemon);
        return "detail";
    }

    @GetMapping(path = "/detailSexe")
    public String detailSexe(Model model, String sexe) {
        try {
            model.addAttribute("pokemons", pokemonSearchApp.getByGender(sexe));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "detail-sexe";
    }

    @GetMapping(path = "/add")
    public RedirectView add(Model model, String name) {
        Pokemon pokemon = metier.getByName(name).block();
        pokemonRepository.save(pokemon).subscribe(t -> {
            System.out.println(t.toString());
        });
        return new RedirectView("/search");
    }


}
*/
