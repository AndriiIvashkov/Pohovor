package server.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import server.entity.Card;


@Repository
@Component
public interface CardRepository {
    @Transactional
    @Modifying
    @Query(value = "insert into card (card_number, points, user) values (:card_number, :points, :user)" , nativeQuery = true)
    void addCard(int cardNumber, int points, int user);

    @Transactional
    @Query(value = "select * from card c where c.card_number = ?1 ", nativeQuery = true)
    Card findByCardNumber(int cardNumber);
}
