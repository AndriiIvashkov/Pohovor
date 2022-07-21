package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import server.entity.Card;
import server.repository.CardRepository;

import java.util.List;
@RestController
@RequestMapping("/api/card")

public class CardServiceRest {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/{cardNumber}")
    public Card getCardByNumber(@PathVariable int cardNumber) {
        return cardRepository.findByCardNumber(cardNumber);
    }

    @PostMapping
    public void addCard(@RequestBody Card card) {
        cardRepository.addCard(card.getCardNumber(), card.getPoints(), card.getUser());
    }
}
