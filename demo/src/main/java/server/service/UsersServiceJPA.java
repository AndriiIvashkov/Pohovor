package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import server.entity.Users;
import server.repository.UsersRepository;

public class UsersServiceJPA implements UsersService{
    @Autowired
    private UsersRepository usersRepository;


    @Override
    public Users login(String username, String password) {
        return usersRepository.findUser(username, password);
    }

    @Override
    public void register(Users user) {
        if (usersRepository.findByEmail(user.getEmail()) != null)
            System.out.println("Customer with this email is already exists");
        else {
            usersRepository.registerUser(user.getFirst_name(), user.getSecondName(), user.getMale(), user.getAge(), user.getCardCount(), user.getEmail(), user.getPhoneNumber(), user.getAccPassword());
            System.out.println("New account has just been registered");
        }
    }

    @Override
    public Users changePhoneNumber(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Users changeFirstName(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Users changeSecondName(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Users changeAge(String email) {
        return usersRepository.findByEmail(email);
    }

    @Override
    public Users changePassword(String email) {
        return usersRepository.findByEmail(email);
    }




}
