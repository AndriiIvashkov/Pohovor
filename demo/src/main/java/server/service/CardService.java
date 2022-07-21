package server.service;

import server.entity.Card;

public interface CardService {

    Card changePoints(Card card, int points);


    void addCard(Card card);
}
