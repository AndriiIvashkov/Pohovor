package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import server.entity.Card;

public class CardServiceRestClient implements CardService{
    private final String url = "http://localhost:8080/api/card";

    CardService cardService;

    @Override
    public Card changePoints(Card card, int points) {
        card.setPoints(card.getPoints() + points);
        return null;
    }
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void addCard(Card card) {
        restTemplate.postForEntity(url, card, Card.class);
    }


}
