package server.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue
    int id;

    int cardNumber;
    int points;

    int user;

    public void setId(int id) {
        this.id = id;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setUser(int PK_id) {
        this.user = PK_id;
    }

    public int getId() {
        return id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getUser() {
        return user;
    }

    public int getPoints() {
        return points;
    }

    public String toString() {
        return "Card{" +
                "id=" + id +
                ", card_number='" + cardNumber + '\'' +
                ", points='" + points + '\'' +
                ", user=" + user +
                '}';
    }
}
