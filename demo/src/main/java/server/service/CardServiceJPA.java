package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import server.entity.Card;
import server.repository.CardRepository;

public class CardServiceJPA implements CardService{

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card changePoints(Card card, int points) {
        card.setPoints(card.getPoints() + points);
        return card;
    }

    @Override
    public void addCard(Card card) {
        cardRepository.addCard(card.getCardNumber(), card.getPoints(), card.getUser());
    }



}
