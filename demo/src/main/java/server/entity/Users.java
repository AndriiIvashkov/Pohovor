package server.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    int id;
    String firstName;
    String secondName;
    char male;
    int age;
    int cardCount;
    String phoneNumber;
    String email;
    String accPassword;

    public Users(int id, String firstName, String secondName, char male, int age, int cardCount, String email, String phoneNumber, String accPassword) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.accPassword = accPassword;
        this.male = male;
        this.cardCount = cardCount;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Users() {

    }

    public char getMale() {
        return male;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getCardCount() {
        return cardCount;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMale(char male) {
        this.male = male;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", first_name='" + firstName +
                ", second_name='" + secondName +
                ", acc_password='" + accPassword +
                ", male='" + male +
                ", age='" + age +
                ", phone_number='" + phoneNumber +
                ", email='" + email +
                ", card_count='" + cardCount +
                '}';
    }
}
