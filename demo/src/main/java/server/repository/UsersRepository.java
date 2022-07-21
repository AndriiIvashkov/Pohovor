package server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import server.entity.Users;




@Repository
@Component
public interface UsersRepository extends JpaRepository<Users, String> {
    @Transactional
    @Modifying
    @Query(value = "insert into users (first_name, second_name, male, age, card_count, email, phone_number, acc_password) values (:first_name, :second_name, :male, :age, :card_count, :email, :phone_number, :acc_password)" , nativeQuery = true)
    void registerUser(String firstName, String secondName, char male, int age, int cardCount, String email, String phoneNumber, String accPassword);
    Users findByEmail(String email);

    @Transactional
    @Query(value = "select * from users u where u.email = ?1  and u.acc_password = ?2", nativeQuery = true)
    Users findUser(String email, String acc_password);

}
