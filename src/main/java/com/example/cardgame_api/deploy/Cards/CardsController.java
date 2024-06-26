package com.example.cardgame_api.deploy.Cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardsController {
    @Autowired CardsRepository repository;

    @GetMapping("/")
    public List<Card> list() { return this.repository.findAll(); }

    @PostMapping("/")
    public Card create(@RequestBody Card card) { return this.repository.save(card); }
}
